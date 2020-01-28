import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
   Scanner in=new Scanner(System.in);
    int r=in.nextInt();
     int c=in.nextInt();
    int m1[][]=new int[r][c];
      int m2[][]=new int[r][c];
      int res[][]=new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        m1[i][j]=in.nextInt();
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
      {m2[i][j]=in.nextInt();
       res[i][j]=m1[i][j]-m2[i][j];}
   
    for(int i=0;i<r;i++)
    { for(int j=0;j<c;j++)
        System.out.print(res[i][j]+" ");
        System.out.print("\n");}
  }
}