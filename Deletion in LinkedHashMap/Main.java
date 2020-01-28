import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      TreeMap<String, String> map=new TreeMap<String, String>();
      System.out.print("Enter the number of values to be inserted in map:");
      int nos=Integer.parseInt(br.readLine());
      System.out.println(nos);
      String idx, value;
      for(int i=1;i<=nos;i++)
         {
             idx=br.readLine();
             value=(br.readLine());
             map.put(idx,value);
         }
         System.out.println(map);
         System.out.print("Enter the index to be removed:") ;
         idx=br.readLine();
         System.out.println(idx);
         map.remove(idx);
         System.out.println(map+"\nSize of map is : "+map.size());
        
          
      }
    }