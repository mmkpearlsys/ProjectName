import java.util.ArrayList;
import java.util.TreeSet;
import java.io.*;
import java.util.*;
class collectlist
{

public static void main(String ars[])
{

  TreeSet<String> ob=new TreeSet<String>();

ob.add("Muthu");
ob.add("Muthu");
ob.add("Abu");
ob.add("Chandran");
ob.add("Arun");
ob.add("Bai");
//ob.remove();
System.out.println(ob);
Iterator<String> lt=ob.iterator();

while(lt.hasNext())
{

System.out.println(lt.next());

}

}
}
