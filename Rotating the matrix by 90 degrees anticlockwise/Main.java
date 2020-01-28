import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int a[][]=new int[r][c];
    for (int i=0;i<r;i++)  
            for (int j=0;j<c;j++) 
                a[i][j]=in.nextInt();
    for (int i=0;i<r;i++)  
            for (int j=i+1;j<c; j++)  
                {int temp = a[i][j];  
                a[i][j] = a[j][i] ;  
                a[j][i] = temp;}  
  for (int i=0;i<r/2;i++)  
            for(int j=0;j<c;j++) 
            {  
                int temp = a[i][j];  
               a[i][j] =a[r- (i + 1)][j];  
                a[r - (i + 1)][j] = temp;  
            }  
 for (int i=0;i<r;i++) 
       {  
            for (int j =0;j<c;j++)  
                System.out.print("" + a[i][j] + " ");  
              
            System.out.println();  
        }  
  }
}