import java.util.Scanner;
class Main{

  public static void power(int base,int exp)
  {int res=1;
    for(int i=1;i<=exp;i++)
      res=res*base;
   System.out.print(res);
  }
  public static void main(String[] args){
  
   Scanner in=new Scanner(System.in);
     int b=in.nextInt();
    int e=in.nextInt();
    power(b,e); 
  }}