import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int si1=-1,si2=-1;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int s1=in.nextInt();
      int s2=in.nextInt();
      for(int i=0;i<n;i++)
      {if(a[i]==s1 )
        si1=i;
        if(a[i]==s2)
          si2=i;}
          System.out.print(si1+"\n"+si2);
    }
}