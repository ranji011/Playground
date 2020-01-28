import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n= in.nextInt();
      int tern = 0;
      for(int con_row=1;con_row<=n;con_row++)
      {
        for(int con_col=1;con_col<=con_row;con_col++)
        {
          if(tern==0)
          {
            System.out.print("*");
            tern=1;
          }
          else
          {
            System.out.print("#");
            tern=0;
          }
          
        }System.out.println();
      }
    }
}