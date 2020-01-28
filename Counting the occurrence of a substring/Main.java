import java.util.Scanner;
class Main{
  public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String sb=in.nextLine();
      int count=0,len=str.length(),len1=sb.length();
     for(int i=0;i<=len-len1;i++)
       if((str.substring(i,i+len1)).equals(sb))
         count++;
    System.out.print(count);
  } 
}