import java.util.*;
import java.io.*;

public class Memory {

  static ArrayList<Byte> memory = new ArrayList<Byte>();

  //HashMap for storing variable names
  static HashMap<String, Integer> table = new HashMap<String, Integer>();

  static public int allocateString(String text)
  {
    int addr = memory.size();
    int size = text.length();
    for (int i=0; i<size; i++) {
      memory.add(new Byte("", text.charAt(i)));
    }
    memory.add(new Byte("", 0));
    return addr;
  }
  
    //method that stores a variable
  static public int allocateVariable(String text)
  {
  	//check if variable has already be used
  	if(table.containsKey(text))
  	{
  	  return table.get(text);
  	}
  	//multipe of 4
  	while(memory.size() % 4 != 0)
  	{
      memory.add(new Byte("", 0));
    }
    int addr = memory.size();
    //allocate 4 bytes
    for (int i=0; i < 4; i++)
    {
      memory.add(new Byte(text, 0));
    }
    table.put(text, addr);
    return addr;
  }
  
  static public int allocateArray(String text, int size)
  {
  	//check if variable has already be used; return address
  	if(table.containsKey(text))
  	{
  	  return table.get(text);
  	}
  	//multipe of 4
  	while(memory.size() % 4 != 0)
  	{
      memory.add(new Byte("", 0));
    }
    int addr = memory.size();
    //allocate 4*size bytes
    for (int i=0; i < 4*size; i++)
    {
      memory.add(new Byte(text, 0));
    }
    table.put(text, addr);
    return addr;
  }
  
  static public void dumpData(PrintStream o)
  {
    Byte b;
    String s;
    int c;
    int size = memory.size();
    for (int i=0; i<size; i++) {
      b = memory.get(i);
      c = b.getContents();
      if (c >= 32) {
        s = String.valueOf((char)c);
      }
      else {
        s = ""; // "\\"+String.valueOf(c);
      }
      o.println("DATA "+c+" ; "+s+" "+b.getName());
    }
  }
}

class Byte {
  String varname;
  int contents;

  Byte(String n, int c)
  {
    varname = n;
    contents = c;
  }

  String getName()
  {
    return varname;
  }

  int getContents()
  {
    return contents;
  }
}
