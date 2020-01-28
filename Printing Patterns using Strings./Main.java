import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
      String str =in.nextLine();
      int len=str.length();
      int a=len/2;
      String s=str.substring(a,len);
      StringBuilder sb=new StringBuilder(s);
      sb.append(str.substring(0,a));
      for(int i=1;i<=len;i++)
      {
        for(int space=1;space<=len-i;space++)
           System.out.print(" ");
        System.out.println(sb.substring(0,i));
          
      }     
  }
}