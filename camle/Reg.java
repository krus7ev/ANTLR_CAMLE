import java.util.*;

public class Reg
{

  static ArrayList regs = new ArrayList();

  static int num = 1;

  static public String newReg()
  {
    //no registers have been used;
    if(regs.isEmpty())
    {
    	regs.add(0,1);
    	regs.add(1,1);
    	num++;
    	regs.add(num,1);
    	return "R"+String.valueOf(num);
    }
    else
    {
    	for(int i=1; i<regs.size(); i++)
    	{
    		if(regs.get(i) == 0)
    		{
    			regs.add(i,1);
    			return "R"+String.valueOf(i);
    		}
    	}
    	num++;
    	regs.add(num,1);
    	return "R"+String.valueOf(num);
    }
  }
  
  static public void emptyReg(int value)
  {
  	regs.add(value,0);
  }

}
