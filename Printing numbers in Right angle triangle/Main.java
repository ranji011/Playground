import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {   
      Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
      for(int con_row = 1;con_row <=n;con_row++)
        {
        for(int con_col = 1;con_col <=con_row;con_col++)
        {
          System.out.print(con_row);
        }
        System.out.println();
      }
	}
}