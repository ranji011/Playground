import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int num=n;
    if(n<0)
      n=n-n-n;
    int temp=n,count=0;
    while(temp>0)
    {
    count++;
    temp=temp/10;
    }
    char str[]=new char[count--];
    while(n>0)
    {
      int rem=n%10;
      char ch=(char)(rem+'0');
      str[count--]=ch;
      n=n/10;
    }
      if(num<0)
        System.out.print("-");
    System.out.print(str);
  }
}