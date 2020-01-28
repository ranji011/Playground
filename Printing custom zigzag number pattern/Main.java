import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         for(int row_count=1;row_count<=n;row_count++)
       {
         for(int col_count=1;col_count<=n;col_count++)
         {
           if(row_count%2==0)
           {
            if(col_count==1)
             System.out.print(row_count+1);
            else 
             System.out.print(row_count);
           }
           else
           {
            if(col_count==n)
             System.out.print(row_count+1);
            else 
             System.out.print(row_count);
         }}
       System.out.print("\n");
      
       }
	}
}