import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    n++;
    String str[]=new String[n];
    for(int i = 0; i <n; i++)
            str[i] = in.nextLine();
     
    
     for (int i=0;i<n;i++) 
         for (int j=i+1;j<n;j++)
            if (str[i].compareTo(str[j])>0) 
             {
                  String temp = str[i];
                  str[i] = str[j];
                  str[j] = temp;
             }
    
  
      for (int i=1;i<n; i++) 
        {
           System.out.println(str[i].toLowerCase());
        }
  }
}