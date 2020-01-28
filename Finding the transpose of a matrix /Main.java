import java.util.Scanner;
class Main{
  public static void main(String args[]){
      Scanner in=new Scanner(System.in);
     int r=in.nextInt();
     int c=in.nextInt();
     int m[][]=new int[r][c];
     int t[][]=new int[c][r];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        m[i][j]=in.nextInt();
     for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        t[j][i]=m[i][j];
     for(int i=0;i<r;i++)
     {for(int j=0;j<c;j++)
       System.out.print(t[j][i]+" ");
        System.out.print("\n");}
  }
}