import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fact,sum=0,temp=n,last;
      while(temp>0)
      {
       fact=1;
       last=temp%10;
       for(int i=2;i<=last;i++)
       fact=fact*i;
        sum=sum+fact;
        temp=temp/10;
      }
      if(sum==n)
         System.out.println("Yes");
      else
         System.out.println("No");
    }
	}
