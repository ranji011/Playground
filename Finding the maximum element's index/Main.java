import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int big=a[0];
    for(int i=1;i<n;i++)
      if(big<a[i])
        big=a[i];
     for(int i=0;i<n;i++)
      if(big==a[i])
        System.out.print(i);
  }
}