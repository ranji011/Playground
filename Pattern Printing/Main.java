import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int col=in.nextInt();
 
      for(int i=0;i<row;i++)
       {int val=row; 
        for(int j=0;j<col;j++)
        {
        if(j<i)
          System.out.print(val--); 
        else
          System.out.print(row-i);       
        }
      System.out.print("\n");
      }
    }
}