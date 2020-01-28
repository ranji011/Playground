import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int k=in.nextInt();
      if(ch<='z' && ch>='a')
      {
        int offset=ch;
        offset=offset-k;
        if(offset<97)
          offset=offset+26;
        ch=(char)(offset);
        System.out.println(ch);
      }
       else if(ch<='Z' && ch>='A')
      {
        int offset=ch;
        offset=offset-k;
        if(offset<65)
          offset=offset+26;
        ch=(char)(offset);
        System.out.println(ch);
      }
        
    }
}