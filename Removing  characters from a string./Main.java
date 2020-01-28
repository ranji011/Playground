import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
      String str =in.nextLine();
      String w=in.nextLine();
      StringBuilder s=new StringBuilder(str);
      int l1=s.length();
      int l2=w.length();
      int flag=0;

      for(int i=0;i<l2;i++)
      {
          int idx=0;
        while(idx<l1)
        {
        if(s.charAt(idx)==w.charAt(i) && s.charAt(idx)!=' ')
          {
           for(int idx2=idx;idx2<l1-1;idx2++)
             s.setCharAt(idx2,s.charAt(idx2+1));
             
            l1--;
             
          }
           idx++;
        }}
      String sb=s.substring(0,l1);
      System.out.print(sb);
      
      
  }
}