import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      int a=0;
      try
      {
      a=in.nextInt();
      }
     catch(InputMismatchException e)
     {
     System.out.print("Input Mismatch Exception occurred");
       System.exit(0);
     }
     System.out.print(a);
   }
}