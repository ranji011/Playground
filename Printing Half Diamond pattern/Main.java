import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in= new Scanner(System.in);
	int n = in.nextInt();
     
	for(int con_row = 1;con_row <= n;con_row++)
	 {
		for (int space=1;space<=(n-con_row);space++)
		{
			System.out.print(" ");
		}
			for(int con_col = 1;con_col <=2*con_row-1;con_col++)
		 {
			 System.out.print("*"); 
			 
		 }
		 System.out.println();
    }
	}
}