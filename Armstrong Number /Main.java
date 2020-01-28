import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=0,temp=n,arm=0,addr=1,last;
      while(temp>0)
      {
        temp=temp/10;
        i++;
      }
      temp=n;
         while(temp>0)
      {
           last=temp%10;
           for(int j=0;j<i;j++)
             addr=addr*last;
           
           arm=arm+addr;
           addr=1;
           temp=temp/10;
      }
      if(n==arm)
        System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
   
      
	}
}