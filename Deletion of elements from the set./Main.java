import java.util.*;
import java.util.TreeSet;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      TreeSet obj=new TreeSet();
      
              String str=br.readLine();
              String temp="";
              for(int i=0;i<str.length();i++)
                {
                  if(str.charAt(i)==',' || i==(str.length())-1)
                     {   
                      if(i==(str.length())-1)
                            temp=temp+str.charAt(i);
                      temp.trim();
                      obj.add(temp);
                      temp="";
                     }
                    else
                     {
                       temp=temp+str.charAt(i);
                     }
                }
          System.out.println(obj);
        while(!obj.isEmpty())
         {
            obj.remove(obj.last());
            System.out.println(obj);
         }        
      }
    }