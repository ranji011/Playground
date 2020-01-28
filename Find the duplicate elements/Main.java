import java.util.*;
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
              System.out.println("Duplicate Entry is:");
              for(int i=0;i<str.length();i++)
                {
                  if(str.charAt(i)==',' || i==(str.length())-1)
                     {   
                      if(i==(str.length())-1)
                            temp=temp+str.charAt(i);
                    if(obj.contains(temp))  
                       System.out.println(temp);
                    else  
                      obj.add(temp);
                      temp="";
                     }
                    else
                     {
                       temp=temp+str.charAt(i);
                     }
                }
          System.out.println("TreeSet is : "+obj);  
      }
    }