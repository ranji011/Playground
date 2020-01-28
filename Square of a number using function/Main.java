import java.util.Scanner;
class Main
{
  public static int square_of(int m)
  {
    int sq= m*m;
    return sq;
  }
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int square = square_of(n);
      System.out.println(square);
	} 
}