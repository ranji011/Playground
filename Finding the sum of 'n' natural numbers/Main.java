import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int s=sum(n);
    System.out.print(s);
  }
  public static int sum(int n)
  {
     if(n==1)
       return 1;
    else
        return n+sum(n-1);
  
  }
    
}