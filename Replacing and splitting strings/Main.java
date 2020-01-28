import java.util.Scanner;
import java.lang.*;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
     
      StringBuilder sb=new StringBuilder(str1);
       sb.setLength(str2.length());
      for(int i=0;i<str2.length();i++)
        sb.setCharAt(i,str2.charAt(i));
     for(int i=0;i<sb.length();i++)
       if(sb.charAt(i)==' ')  
          System.out.print("\n");
      else
          System.out.print(sb.charAt(i));
        
    }
}