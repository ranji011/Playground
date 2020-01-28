import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in= new Scanner(System.in);
	int n = in.nextInt();
      int num=n;
	for(int con_row = 0;con_row <n;con_row++)
	 {
			for(int con_col = num;con_col >0;con_col--)
		 {
			 System.out.print(con_col); }
			num=num-1; 
		 
		 System.out.println();
    }
	}
}