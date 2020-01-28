import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=1;
      for(int i=1;i<=n;i=i+1)
      {
        System.out.println(k);
        k=k+2;
      }
	}
}