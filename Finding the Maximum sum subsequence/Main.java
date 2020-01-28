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
    int sum[]=new int[2*n];
    int idx=0,big,sm=0;
    for(int i=0;i<n-1;i++)
      {
      if(i==n-2)
      {
       if(a[i]<a[i+1])
         sm=sm+a[i]+a[i+1];
      else
         sm=a[i+1];
         sum[idx++]=sm;
      }
      else if(a[i]<a[i+1])
       {sm=sm+a[i];}
        else
        {sm=sm + a[i];
         sum[idx++]=sm;
         sm=0;}
    }
    sum[idx++]=sm;
          
   
          
    big=sum[0];
    for(int i=1;i<idx;i++)
      if(big<sum[i])
        big=sum[i];
    System.out.println(big);
   
  }
}