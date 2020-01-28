import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();    
        int a[]=new int[n];
        int i,zero=0;;
        for(i=0;i<n;i++)
          a[i]=in.nextInt();
        for(i=0;i<n;i++)
          if(a[i]!=0)
            System.out.print(a[i]+" ");
          else
            zero++;
         for(i=0;i<zero;i++)
           System.out.print("0 ");
    }
}