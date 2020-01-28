import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       InputStreamReader r=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(r);
       List lst=new LinkedList();
    
      
      String str=br.readLine();
      String month=br.readLine();
      String temp="";
      for(int i=0;i<str.length();i++)
      {
          if(str.charAt(i)==',' || i==(str.length())-1)
          {   
            if(i==(str.length())-1)
              temp=temp+str.charAt(i);
            temp.trim();
            lst.add(temp);
            temp="";
          }
          else
          {
              temp=temp+str.charAt(i);
          }
      }
      System.out.println(lst);
      System.out.println("Size of the linked list: "+lst.size());
       System.out.print("Is LinkedList empty? ");
      if(lst.size()==0)
        System.out.println("true");
      else
        System.out.println("false");
      System.out.println("Does LinkedList contains "+month+"?");
      System.out.println(lst.contains(month));
      
      
    }
}