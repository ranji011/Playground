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
    int cnt[]=new int[10];
    int num;
      for(int i=0;i<10;i++)
        cnt[i]=0;
    for(int i=0;i<n;i++)
      {
      cnt[a[i]]++;}
    int big=cnt[0];
     for(int i=1;i<10;i++)
       if(big<cnt[i])
         big=cnt[i];
    for(int i=0;i<n;i++)
      if(big==cnt[a[i]])
      {System.out.println(a[i]);
         break;}
  }
}