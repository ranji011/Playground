import java.util.Scanner;
class Main{
  public static int great(int a,int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int grt=great(a,b);
      if(grt>c)
        System.out.print(grt);
      else
        System.out.print(c);
    }
      
          
	}
