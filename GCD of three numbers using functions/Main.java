import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    int min;
    if(a<b)
      min=a;
    else
      min=b;
    while(min>0)
    {
      if(a % min == 0 && b % min==0)
        return min;
      min--;
    }
      return 1;
  }
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
          int a=in.nextInt();
          int b=in.nextInt();
          int c=in.nextInt();
      int temp=gcd(a,b);
      int res=gcd(temp,c);
      System.out.print(res);
	}
}