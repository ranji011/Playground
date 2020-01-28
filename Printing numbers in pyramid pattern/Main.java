import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in= new Scanner(System.in);
	int n = in.nextInt();
      int num=1;
	for(int con_row = 1;con_row <= n;con_row++)
	 {
		for (int space=1;space<=(n-con_row);space++)
		{
			System.out.print(" ");
		}
			for(int con_col = 1;con_col <=con_row;con_col++)
		 {
			 System.out.print(num+" " ); 
			 num=num+1;
		 }
		 System.out.println();
    } 
    }    
}