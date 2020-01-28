import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int arr[]=new int[26];
      int flag[]=new int[26];
      int len=sb.length(),offset;
        for(int i=0;i<26;i++)
        {arr[i]=0;
          flag[i]=0;}
      for(int i=0;i<len;i++)
      {
       if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
       {
       offset=sb.charAt(i)-'a';
         arr[offset]++;
       }
        else
        {
        offset=sb.charAt(i)-'A';
        arr[offset]++;
      }
        
      }
      String str1= new String(str.toLowerCase());
      for(int i=0;i<len;i++)
      { if(flag[(str1.charAt(i)-'a')]==0)
        {System.out.print(str1.charAt(i)+""+arr[(str1.charAt(i)-'a')]+" ");
         flag[(str1.charAt(i)-'a')]=1;
        }
      }
    }
}