import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
       int k=in.nextInt();
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
    
      int b[]=new int[10];
      for(int i=0;i<n;i++)
        b[a[i]]++;
      
      for(int i=1;i<=k;i++)
        System.out.println(i +" "+b[i]);
      
      
    }
}