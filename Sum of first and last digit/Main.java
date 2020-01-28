import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum;
      sum=n%10;
      while(n>9)
        n=n/10;
      sum=sum+n;
      System.out.println(sum);
     
}}