import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Set obj=new LinkedHashSet();
      
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
          System.out.print("Enter the value to be deleted: ");
          temp=br.readLine();
          System.out.println(temp);
          obj.remove(temp);
          System.out.println(obj);
          
          System.out.print("Enter the value to be added: ");
          temp=br.readLine();
          System.out.println(temp);
          obj.add(temp);
          System.out.println(obj);
      }
    }