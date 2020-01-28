import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int cnt[]=new int[2*n];
      int count=0,idx=0,big=0;
      for(int i=0;i<n;i++)
      { if(a[i]==1)
          count++;
        else
          {cnt[idx++]=count;
          count=0;}}
      big=cnt[0];
      for(int i=1;i<idx;i++)
        if(big<a[i])
          big=a[i];
      System.out.println(big);

      
    }
}