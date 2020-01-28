import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int key=in.nextInt();
    int len=str.length();
    for(int i=0;i<len;i++)
    {
    char ch=str.charAt(i);
    if(ch<='z' && ch>='a')
    {
      int offset=ch-'a';
      if(offset<key)
        ch=(char)('z'-(key-offset)+1);
      else
      {offset=(offset-key)%26;
      ch=(char)('a'+offset);}
        System.out.print(ch);
    }
      else  if(ch<='Z' && ch>='A')
    {
      int offset=ch-'A';
      offset=(offset-key)%26;
      ch=(char)('A'+offset);
        System.out.print(ch);
    }
      else
        System.out.print(ch);
    
    }
  
  }
}