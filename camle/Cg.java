// COMS22303: Code generation

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import antlr.collections.AST;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Cg
{
  	// Generate code from a program (in IRTree form)
  	public static void program(IRTree irt, PrintStream o)
  	{
		emit(o, "XOR R0,R0,R0");   // Initialize R0 to 0
		statement(irt, o);
		emit(o, "HALT");           // Program must end with HALT
		Memory.dumpData(o);        // Dump DATA lines: initial memory contents
  	}

 	// Generate code from a statement (in IRTree form)
  	private static void statement(IRTree irt, PrintStream o)
  	{
    	if (irt.getOp().equals("SEQ"))
    	{
      		statement(irt.getSub(0), o);
      		statement(irt.getSub(1), o);
    	}

    	else if (irt.getOp().equals("WRS") && 
                 irt.getSub(0).getOp().equals("MEM") && 
             	 irt.getSub(0).getSub(0).getOp().equals("CONST"))
        {
      		String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      		emit(o, "WRS "+a);
    	}

    	else if (irt.getOp().equals("WRR"))
    	{
      		String e = expression(irt.getSub(0), o);
      		emit(o, "WRR "+e);

      		int index = Integer.parseInt(e.substring(1));
			Reg.emptyReg(index);
    	}

    	else if (irt.getOp().equals("READ"))
    	{
      		String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      		String register = Reg.newReg();
      		emit(o, "RDR " + register);
      		emit(o, "STORE " + register + "," + "R0," + a);

      		int index = Integer.parseInt(register.substring(1));
			Reg.emptyReg(index);	
    	}

    	else if (irt.getOp().equals("MOVE"))
    	{
			String a = irt.getSub(0).getSub(0).getSub(0).getOp();
			String e = expression(irt.getSub(1), o);
			emit(o, "STORE "+e+",R0,"+a);

      		int index = Integer.parseInt(e.substring(1));
			Reg.emptyReg(index);	
    	}

    	else if (irt.getOp().equals("MOVA"))
    	{
    		String a = irt.getSub(0).getSub(0).getSub(0).getOp();
    		String off = expression(irt.getSub(2), o);
			String e = expression(irt.getSub(1), o);
			
			String register = Reg.newReg();
			String r = Reg.newReg();
			
            emit(o, "MOVIR "+r+",4.0");
			emit(o, "MULR "+register+","+off+","+r);
			emit(o, "STORE "+e+","+register+","+a);

      		int index = Integer.parseInt(e.substring(1));
			Reg.emptyReg(index);	
      		index = Integer.parseInt(register.substring(1));
			Reg.emptyReg(index);
			index = Integer.parseInt(off.substring(1));
			Reg.emptyReg(index);
			index = Integer.parseInt(r.substring(1));
			Reg.emptyReg(index);
    	}

    	else if (irt.getOp().equals("LABEL")) 
        {
      		emit(o, irt.getSub(0).getOp()+":");
    	}

		else if (irt.getOp().equals("CJUMP"))
		{			
            String a = irt.getSub(0).getOp();
			
			String left = expression(irt.getSub(1), o);
			String right = expression(irt.getSub(2), o);
			String reg = "";
			
			String labelA = irt.getSub(3).getOp();
			String labelB = irt.getSub(4).getOp();

			if(a.equals(">"))
			{
				reg = Reg.newReg();
				emit(o, "SUBR " + reg +"," + left + "," + right);
				emit(o, "BLTZR " + reg + "," + labelB);
				emit(o, "JMP " + labelA);
			}

			if(a.equals(">="))
			{
				reg = Reg.newReg();
				emit(o, "SUBR " + reg +"," + left + "," + right);
				emit(o, "BGEZR " + reg + "," + labelA);
				emit(o, "JMP " + labelB);
			}

			if(a.equals("<"))
			{
				reg = Reg.newReg();
				emit(o, "SUBR " + reg +"," + left + "," + right);
				emit(o, "BLTZR " + reg + "," + labelA);
				emit(o, "JMP " + labelB);
			}

			if(a.equals("<="))
			{
				reg = Reg.newReg();
				emit(o, "SUBR " + reg +"," + right + "," + left);
				emit(o, "BLTZR " + reg + "," + labelB);
				emit(o, "JMP " + labelA);
			}

			if(a.equals("="))
			{
				reg = Reg.newReg();
				emit(o, "SUBR " + reg +"," + left + "," + right);
				emit(o, "BEQZR " + reg + "," + labelA);
				emit(o, "JMP " + labelB);
			}

			if(a.equals("!="))
			{
				reg = Reg.newReg();
				emit(o, "SUBR " + reg +"," + left + "," + right);
				emit(o, "BNEZR " + reg + "," + labelA);
				emit(o, "JMP " + labelB);
			}
			
      		int index = Integer.parseInt(left.substring(1));
			Reg.emptyReg(index);
			index = Integer.parseInt(right.substring(1));
			Reg.emptyReg(index);
			index = Integer.parseInt(reg.substring(1));
			Reg.emptyReg(index);	
		}

		else if (irt.getOp().equals("JUMP"))
		{
			emit(o, "JMP " + irt.getSub(0).getSub(0).getOp());
		}

		else if(irt.getOp().equals("NOOP"))
		{
		    emit(o,"NOP");
		}

		else if (irt.getOp().equals("ARRAY")) {}

    	else
    	{
      		error(irt.getOp());
    	}
  	}

  	// Generate code from an expression (in IRTree form)
  	private static String expression(IRTree irt, PrintStream o)
  	{
		String result = "";

		if (irt.getOp().equals("CONST"))
		{
      		String t = irt.getSub(0).getOp();
      		result = Reg.newReg();
      		emit(o, "MOVIR "+result+","+t);
    	}

        else if (irt.getOp().equals("BINOP"))
        {
		    
            if (irt.getSub(0).getOp().equals("+"))
		    { 	
			    if(irt.getSub(2) == null)
			    {
				    String reg = expression(irt.getSub(1), o);
				    result = Reg.newReg();
				    emit(o, "ADDR" + " "+result+",R0,"+reg);
				
				    int index = Integer.parseInt(reg.substring(1));
				    Reg.emptyReg(index);
			    }
			    else
			    {
				    String reg1 = expression(irt.getSub(1), o);
	     			String reg2 = expression(irt.getSub(2), o);
	     			result = Reg.newReg();
	     			emit(o, "ADDR" + " "+result+","+reg1+","+reg2);
			    }
		    }
		    else if (irt.getSub(0).getOp().equals("-"))
		    {   	
			    if(irt.getSub(2) == null)
			    {
				    String reg = expression(irt.getSub(1), o);
				    result = Reg.newReg();
				    emit(o, "SUBR" + " "+result+",R0,"+reg);
				
				    int index = Integer.parseInt(reg.substring(1));
				    Reg.emptyReg(index);
			    }
			    else
			    {
				    String reg1 = expression(irt.getSub(1), o);
	     			String reg2 = expression(irt.getSub(2), o);
	     			result = Reg.newReg();
	     			emit(o, "SUBR" + " "+result+","+reg1+","+reg2);
	     			
				    int index = Integer.parseInt(reg2.substring(1));
				    Reg.emptyReg(index);
			    }
		    }
		    else if (irt.getSub(0).getOp().equals("*"))
		    {
			    String reg1 = expression(irt.getSub(1), o);
			    String reg2 = expression(irt.getSub(2), o);
			    result = Reg.newReg();
			    emit(o, "MULR" + " "+result+","+reg1+","+reg2);
		    }
		    else if (irt.getSub(0).getOp().equals("/"))
		    {
			    String reg1 = expression(irt.getSub(1), o);
			    String reg2 = expression(irt.getSub(2), o);
			    result = Reg.newReg();
			    emit(o, "DIVR" + " "+result+","+reg1+","+reg2);
			
      			int index = Integer.parseInt(reg1.substring(1));
			    Reg.emptyReg(index);
      			index = Integer.parseInt(reg2.substring(1));
			    Reg.emptyReg(index);

		    }
        }

		else if (irt.getOp().equals("MEM"))
		{
			String a = irt.getSub(0).getSub(0).getOp();
			result = Reg.newReg();
			emit(o, "LOAD "+result+",R0,"+a);
		}

		else if (irt.getOp().equals("MEMA"))
		{
			String a = irt.getSub(0).getSub(0).getOp();
			String off = expression(irt.getSub(1), o);
			result = Reg.newReg();
			String register = Reg.newReg();
			String r = Reg.newReg();
			emit(o, "MOVIR "+r+",4.0");
			emit(o, "MULR "+register+","+off+","+r);
			emit(o, "LOAD "+result+","+register+","+a);
			
  			int index = Integer.parseInt(r.substring(1));
			Reg.emptyReg(index);
  			index = Integer.parseInt(off.substring(1));
			Reg.emptyReg(index);
			index = Integer.parseInt(register.substring(1));
			Reg.emptyReg(index);	
		} 
    
    	else
    	{
      		error(irt.getOp());
    	}

    	return result;
  	}

  	private static void emit(PrintStream o, String s)
  	{
    	o.println(s);
  	}

  	private static void error(String op)
  	{
    	System.out.println("CG error: "+op);
    	System.exit(1);
  	}
}
