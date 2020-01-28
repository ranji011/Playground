import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      String temp=str1+str1;
      int len=temp.length();
      int len1=str2.length();
      int match=0;
      for(int i=0;i<=len-len1;i++)
      {
        if(str2.equals(temp.substring(i,i+len1)))
        {match=1;
     
          break;}
      }
      if(match==1)
        System.out.print( "Yes");
      else
        System.out.print("No");
       
      
      }
    }
