import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        int k=in.nextInt();
        for (int i = 0; i < n- 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < n; j++){  
                if (a[j] < a[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        } 
     System.out.print(a[n-k]);
    }   
}