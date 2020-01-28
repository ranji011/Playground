import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      for(int row_con=1;row_con<=n;row_con++)
      {
        for(int col_con=1;col_con<=n;col_con++)
        {
          if(( row_con==col_con)||(col_con+row_con==n+1))
          {
            System.out.print("*");
          }
          else
             System.out.print(" ");
         }System.out.println();
      }
	}
}