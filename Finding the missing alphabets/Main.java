import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String str1=new String(str.toLowerCase());
      int arr[]=new int[26];
      int len=str.length(),offset;
      for(int i=0;i<len;i++)
      if(str1.charAt(i)!=' ')
      {
         offset=str1.charAt(i)-'a';
         arr[offset]=1;
       }
      for(int i=0;i<26;i++)
      {
        if(arr[i]!=1)
        {System.out.print((char)('a'+i)+" ");
        }
      }
    }
}