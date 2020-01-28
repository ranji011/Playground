import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
        int n=in.nextInt();    
        int a[]=new int[n];
        int i;
        int ta[]=new int[n];
        for(i=0;i<n;i++)
          a[i]=in.nextInt();
        int r=in.nextInt();
        int temp,j=0,k;
          for(i=0;i<n;i=i+2)
            ta[j++]=a[i];
        temp=ta[j-1];
        for(k=0;k<r;k++)
        { temp=ta[j-1];
        for(i=j-1;i>0;i--)
          ta[i]=ta[i-1];
          ta[i]=temp;}
         j=0;
        for(i=0;i<n;i=i+2)
            a[i]=ta[j++];
            
      j=0;
     for(i=1;i<n;i=i+2)
            ta[j++]=a[i];
        temp=ta[j-1];
        for(k=0;k<r;k++)
        { temp=ta[0];
        for(i=0;i<j-1;i++)
          ta[i]=ta[i+1];
          ta[i]=temp;}
         j=0;
        for(i=1;i<n;i=i+2)
            a[i]=ta[j++];
         /*temp=a[0];
       for(j=0;j<r;j++)
       {for(i=2;i<n-2;i=i+2)
        a[i+2]=a[i];
          a[i]=temp;}*/
     for(i=0;i<n;i++)
       System.out.print(a[i]+" ");
       
  	}
}