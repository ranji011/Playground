import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      StringBuilder rev=new StringBuilder("");
      
      int len=str.length();
      for(int i=len-1;i>=0;i--)
      {
      rev.append(sb.charAt(i));
      }
      if(rev.toString().equals(sb.toString()))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}