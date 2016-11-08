// COMS22303: IR tree construction
//
// This program converts an Abstract Syntax Tree produced by ANTLR to an IR tree.
// The Abstract Syntax Tree has type CommonTree and can be walked using 5 simple
// methods.  If ast is a CommonTree and t is a Token:
//   
//   int        ast.getChildCount();                       // Get # of subtrees
//   CommonTree (CommonTree)ast.getChild(int childNumber); // Get a subtree
//   Token      ast.getToken();                            // Get a node's token
//   int        t.getType();                               // Get token type
//   String     t.getText();                               // Get token text
//
// Every method below has two parameters: the AST (input) and IR tree (output).
// Some methods (arg()) return the type of the item processed.

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import antlr.collections.AST;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Irt
{
// The code below is generated automatically from the ".tokens" file of the 
// ANTLR syntax analysis, using the TokenConv program.
//
// CAMLE TOKENS BEGIN
  public static final String[] tokenNames = new String[] {
"NONE", "NONE", "NONE", "NONE", "BEGIN", "WRITELN", "WRITE", "READ", "ARRAY", "IF", "ELSE", "REPEAT", "UNTIL", "END", "SEMICOL", "OPENP", "CLOSEP", "OPENSQB", "CLOSESQB", "COMMA", "PLUS", "MINUS", "DIV", "MULT", "GREATER", "GREATEQ", "LESS", "LESSEQ", "EQ", "NEQ", "ASSIGN", "LETTER", "SYMB", "IDENTIFIER", "DIGIT", "INT", "EXPONENT", "REALNUM", "STRING", "COMMENT", "WS"};
  public static final int EXPONENT=36;
  public static final int LETTER=31;
  public static final int ELSE=10;
  public static final int INT=35;
  public static final int MULT=23;
  public static final int MINUS=21;
  public static final int WRITE=6;
  public static final int IF=9;
  public static final int CLOSESQB=18;
  public static final int WS=40;
  public static final int NEQ=29;
  public static final int GREATER=24;
  public static final int WRITELN=5;
  public static final int CLOSEP=16;
  public static final int LESSEQ=27;
  public static final int GREATEQ=25;
  public static final int SYMB=32;
  public static final int READ=7;
  public static final int COMMA=19;
  public static final int UNTIL=12;
  public static final int IDENTIFIER=33;
  public static final int BEGIN=4;
  public static final int REALNUM=37;
  public static final int LESS=26;
  public static final int ASSIGN=30;
  public static final int SEMICOL=14;
  public static final int PLUS=20;
  public static final int REPEAT=11;
  public static final int DIGIT=34;
  public static final int DIV=22;
  public static final int EQ=28;
  public static final int OPENSQB=17;
  public static final int END=13;
  public static final int COMMENT=39;
  public static final int OPENP=15;
  public static final int ARRAY=8;
  public static final int STRING=38;
// CAMLE TOKENS END

     // Label enumerator $
 	public static int num = 0;
  
    // Label generator $
  	public static String label()
  	{
  		num++;
  		return "L" + String.valueOf(num);
  	}

    // Wrapper $
    public static IRTree convert(CommonTree ast)
    {
        IRTree irt = new IRTree();
        program(ast, irt);
        return irt;
    }
 
    // Convert a program AST to IR tree $
    public static void program(CommonTree ast, IRTree irt)
    {
        statements(ast, irt);
    }

    // Convert a program AST to IR tree $
    public static void statements(CommonTree ast, IRTree irt)
    {
        Token t = ast.getToken();
        int tt = t.getType();

        if (tt == BEGIN) 
        {
            int n = ast.getChildCount();
            if (n == 0) 
            {
                irt.setOp("NOOP");
            }
            else 
            {
                statements1(ast, 0, n-1, irt);
            }
        }
        else if (tt == ARRAY)
        {
            int i;
            for(i=0; i<ast.getChildCount()-1; i++)
            {			
                String temp = ast.getChild(i).getChild(0).getText();
                int val =(int) Double.parseDouble(temp);
                int a = Memory.allocateArray(ast.getChild(i).getText(),val);
                irt.setOp("NOOP");
            }
            statements((CommonTree)ast.getChild(i),irt);
        }
        else
        {
            error(tt);
        }
    }

    // Convert constituting statements of compound statement $
    public static void statements1(CommonTree ast, int first, int last, IRTree irt)
    {
        CommonTree ast1 = (CommonTree)ast.getChild(first);

        if (first == last) 
        {
            statement(ast1, irt);
        }
        else 
        {
            IRTree irt1 = new IRTree();
            IRTree irt2 = new IRTree();

            statement(ast1, irt1);
            statements1(ast, first+1, last, irt2);
            irt.setOp("SEQ");
            irt.addSub(irt1);
            irt.addSub(irt2);
        }
    }

  // Convert a statement AST to IR tree
    public static void statement(CommonTree ast, IRTree irt)
    {
        CommonTree ast1, ast2;
        IRTree irt1 = new IRTree();
        IRTree irt2 = new IRTree();
        IRTree irt3 = new IRTree();

        Token t = ast.getToken();
        int tt = t.getType();

        // translate an assignment statement to IR
        if (tt == ASSIGN)
        {
            int count = ast.getChild(0).getChildCount();
            if (count == 0)
            {
                irt.setOp("MOVE");
                
                //get identifier ast node
                ast1 = (CommonTree)ast.getChild(0);
                //convert identifier - allocate variable memory
                String type1 = arg(ast1, irt1);
                //add node to irt
                irt.addSub(irt1);
                
                //get expression node
                ast2 = (CommonTree)ast.getChild(1);
                //convert expression 
                String type2 = arg(ast2, irt2);
                //add node to irt 
                irt.addSub(irt2);
            }
            else
            {
                irt.setOp("MOVA");
                
                //get identifier name
                ast1 = (CommonTree)ast.getChild(0);
                //convert identifier - allocate variable memory
                String type1 = arg(ast1, irt1);
                //add node to irt
                irt.addSub(irt1);
                
                //index value
                CommonTree ast3 = (CommonTree)ast1.getChild(0);
                //convert index value expression
                String type3 = arg(ast3, irt3);
                
                //cover expression node
                ast2 = (CommonTree)ast.getChild(1);
                //convert expression
                String type2 = arg(ast2, irt2);
                //add node to irt
                irt.addSub(irt2);
            }
        }
        //Translate a read statement to IR
        else if (tt == READ)
        {
            irt.setOp("READ");
            
            ast1=(CommonTree)ast.getChild(0);
            String type = arg(ast1, irt1);
            
            irt.addSub(irt1);
        }
        //Translate a write statement to IR
        else if (tt == WRITE) 
        {
            ast1 = (CommonTree)ast.getChild(0);
            String type = arg(ast1, irt1);

            if (type.equals("real")) 
            {
                irt.setOp("WRR");
                irt.addSub(irt1);
            }
            else 
            {
                irt.setOp("WRS");
                irt.addSub(irt1);
            }
        }
        //Translate a write-new-line statement to IR
        else if (tt == WRITELN) 
        {
            String a = String.valueOf(Memory.allocateString("\n"));
            irt.setOp("WRS");
            irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a))));
        }
        //Translate conditional branching
        else if (tt == IF)
        {
            irt.setOp("SEQ");     
            cBranch(ast, irt1, irt2);
            irt.addSub(irt1);
            irt.addSub(irt2);       
        }
        //Translate repeat-until loop branching to IR
        else if (tt == REPEAT)
        {
            irt.setOp("SEQ");
            loopBranch(ast, irt);
        }
        else 
        {
          error(tt);
        }
    }
    
    //Translate conditional branching $
    public static void cBranch(CommonTree ast, IRTree irtCond, IRTree irtSeq)
    {
        int childCount = ast.getChildCount();
        
        CommonTree ast1, ast2, astCond;
        astCond = (CommonTree)ast.getChild(0);
        
        IRTree seq1 = new IRTree("SEQ");
        IRTree seq2 = new IRTree("SEQ");
        IRTree seq3 = new IRTree("SEQ");
        IRTree seq4 = new IRTree("SEQ");
        IRTree s1   = new IRTree();
        IRTree s2   = new IRTree();        

        String n1 = label();
        String n2 = label();
        String n  = label();
 
        irtSeq.setOp("SEQ");
        
        if (childCount == 2)
        { 
            translate(astCond, irtCond, n1, n);
            ast1 = (CommonTree)ast.getChild(1);
            statements(ast1, s1);
            
            irtSeq.addSub(new IRTree("LABEL", new IRTree(n1)));
            
            seq1.addSub(s1);
            seq1.addSub(new IRTree("LABEL", new IRTree(n)));
            
            irtSeq.addSub(seq1);
        }
        else if (childCount == 3)
        {
            translate(astCond, irtCond, n1, n2);
            ast1 = (CommonTree)ast.getChild(1);
            ast2 = (CommonTree)ast.getChild(2);
            statements(ast1, s1);
            statements(ast2, s2);
            
            irtSeq.addSub(new IRTree("LABEL", new IRTree(n1)));
            
            seq1.addSub(s1);
            
            seq2.addSub(new IRTree("JUMP", new IRTree("NAME", new IRTree(n))));
            
            seq3.addSub(new IRTree("LABEL", new IRTree(n2)));
            
            seq4.addSub(s2);
            seq4.addSub(new IRTree("LABEL", new IRTree(n)));
            
            seq3.addSub(seq4);
            
            seq2.addSub(seq3);
            
            seq1.addSub(seq2);
            
            irtSeq.addSub(seq1);
        }
        else
            error(IF);
    }
    
    //Translate a boolean relation to be evaluated $
  	public static void translate(CommonTree ast, IRTree tree, String label1, String label2)
 	{
        tree.setOp("CJUMP");
        IRTree opNode = new IRTree();
    
    	setIrtOp(ast, opNode);
		tree.addSub(opNode);

		IRTree exp1 = new IRTree();
		IRTree exp2 = new IRTree();
		
		expression((CommonTree)ast.getChild(0), exp1);
		expression((CommonTree)ast.getChild(1), exp2);
		
		tree.addSub(exp1);
		tree.addSub(exp2); 
        
		tree.addSub(new IRTree(label1));
		tree.addSub(new IRTree(label2));
  	}
    
    //Translate repeat-until loop branching $
    public static void loopBranch(CommonTree ast, IRTree irt)
    {
        CommonTree astLoop = (CommonTree)ast.getChild(0);
        CommonTree astCond = (CommonTree)ast.getChild(1);
        
        String n1 = label();
        String n  = label();
        
        IRTree irtStart = new IRTree("LABEL", new IRTree(n1));
        IRTree irtLoop = new IRTree("SEQ");
        IRTree irtStm = new IRTree();
        IRTree irtSeq = new IRTree("SEQ");
        IRTree irtCond = new IRTree();
        IRTree irtOut = new IRTree("LABEL", new IRTree(n));
        
        irt.addSub(irtStart);
        
        statements(astLoop, irtStm);
        
        irtLoop.addSub(irtStm);
        
        translate(astCond, irtCond, n, n1);
 
        irtSeq.addSub(irtCond);
        irtSeq.addSub(irtOut);
        
        irtLoop.addSub(irtSeq);
        
        irt.addSub(irtLoop);
    }
    
    // Convert an arg AST to IR tree $
    public static String arg(CommonTree ast, IRTree irt)
    {
        Token t = ast.getToken();
        int tt = t.getType();
        IRTree irt1 = new IRTree();

        if (tt == STRING) 
        {
            String tx = t.getText();
            int a = Memory.allocateString(tx); 
            String st = String.valueOf(a);

            irt.setOp("MEM");
            irt.addSub(new IRTree("CONST", new IRTree(st)));

            return "string";
        }
        else 
        {
            expression(ast, irt);      
            return "real";
        }
    }

    // Convert an expression AST to IR tree $
    public static void expression(CommonTree ast, IRTree irt)
    {
        CommonTree ast1, ast2;
        IRTree irt1 = new IRTree();
        IRTree irt2 = new IRTree();
        IRTree irt3 = new IRTree();
        
        Token t = ast.getToken();
        int tt = t.getType();

        if (tt == REALNUM) 
        {
            constant(ast, irt1);
            irt.setOp("CONST");
            irt.addSub(irt1);
        }
        else if (tt == PLUS || tt == MINUS || tt == MULT || tt == DIV)
        {  
               
            irt.setOp("BINOP");
            binOp(ast, irt1, irt2, irt3);
            irt.addSub(irt1);
            irt.addSub(irt2);
            if (ast.getChildCount() == 2)
                irt.addSub(irt3);
            else irt.addSub(null);
        }
        else if (tt == IDENTIFIER)
        {
            if(ast.getChildCount() == 0)
            {
                String var = t.getText();
                int a = Memory.allocateVariable(var);
                String st = String.valueOf(a);
                irt.setOp("MEM");
                irt.addSub(new IRTree("CONST", new IRTree(st)));
            }
            else
            {
                String var = t.getText();
                //array start
                int a = Memory.allocateVariable(var);
                String st = String.valueOf(a);
                //get offset
                ast1 = (CommonTree)ast.getChild(0);
                expression(ast1,irt1);
                irt.setOp("MEMA");
                irt.addSub(new IRTree("CONST", new IRTree(st)));
                irt.addSub(irt1);
            }
        }
    }
    
    // Convert a binary operation AST to IR tree $
    public static void binOp(CommonTree ast, IRTree irt1, IRTree irt2, IRTree irt3) 
    {
        CommonTree ast1, ast2;
        int n = ast.getChildCount();
        setIrtOp(ast, irt1);
        
        //unary operator
        if (n == 1) 
        {            
            ast1 = (CommonTree)ast.getChild(0);
            expression(ast1, irt2);
        } 
        else if (n == 2) 
        { 
            ast1 = (CommonTree)ast.getChild(0);
            expression(ast1, irt2);
            
            ast2 = (CommonTree)ast.getChild(1);
            expression(ast2, irt3);
        } 
        else 
        {
            System.out.println("in binop");
            error(ast.getToken().getType());
        }  
    }   

    // Convert an AST operator name to IR tree operator text (symbol) $
    public static void setIrtOp(CommonTree ast, IRTree irt) 
{
        Token t = ast.getToken();
        String tx = t.getText();
        irt.setOp(tx);
    }
  
    // Convert a constant AST to IR tree $
    public static void constant(CommonTree ast, IRTree irt)
    {
        Token t = ast.getToken();
        int tt = t.getType();
        if (tt == REALNUM) 
        {
            String value = t.getText();
            irt.setOp(value);
        }
        else 
        {
            System.out.println("constant");
            error(tt);
        }
    }
  
    //error throwing $
    private static void error(int tt)
    {
        System.out.println("IRT error: "+tokenNames[tt]);
        System.exit(1);
    }
}
