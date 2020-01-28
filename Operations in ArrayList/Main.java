import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ArrayList lst=new ArrayList();
      
      while(true)
      {
       System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
       int ch=Integer.parseInt(br.readLine());
       switch(ch)
      {
        case 1:
            { 
              String str=br.readLine();
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
                }break;
                
            }
        case 2:
            {
                System.out.print("Enter the index value to be deleted:");
                int idx=Integer.parseInt(br.readLine());
                System.out.println(idx);
                lst.remove(idx);
                
            }break;
        case 3:
            {
                System.out.println(lst);
            }break;
        case 4:
            {
                System.exit(0);
                
            }
            default:System.out.println("Invalid Input");
          
       }}
    }
}