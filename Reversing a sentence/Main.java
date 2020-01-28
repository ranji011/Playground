import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      StringBuilder rev=new StringBuilder("");
      int len=sb.length();
      int j=len;
       for(int i=len-1;i>=0;i--)
      {
     
      if(sb.charAt(i)==' ')
     {
      rev.append(sb.substring(i+1,j));
      rev.append(" ");
      j=i;
     
      }
       if( i==0)
     {
      rev.append(sb.substring(i,j));
     
      }}
        System.out.print(rev);   
    }}
