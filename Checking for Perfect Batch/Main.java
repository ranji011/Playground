import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int array_size = sc.nextInt();
    int array[] = new int[array_size];
    for(int ind =0;ind<array_size;ind++)
    {
      array[ind] = sc.nextInt();
    }
    batch(array,array_size); 
  }
  public static void batch(int array[],int array_size)
  {
   boolean batch = true;
    int sum = array[0]+array[1]+array[2];
    for(int ind = 3;ind <array_size;ind=ind+3)
    {
      int sum2 = array[ind]+array[ind+1]+array[ind+2];
      if (sum !=sum2){
        batch = false;
      }
    }
      if(batch==true)
      {
        System.out.println("Perfect Batch");
      }
      else
        System.out.println("Not a Perfect Batch");  
  }  
}