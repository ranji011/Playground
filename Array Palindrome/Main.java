import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int left=0,right=n-1,flag=1;
      while(left<right)
      {
      if(a[left++]!=a[right--])
       {flag=0;
        break;}
      }
      if(flag==1)
        System.out.print("Yes");
      else
        System.out.print("No");
      
      
    }
}