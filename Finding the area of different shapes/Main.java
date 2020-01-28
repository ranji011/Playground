import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int ch=in.nextInt();
      switch(ch)
      {
        case 1:
          {
          int side=in.nextInt();
          int area=side*side;
          System.out.print(area);
          }break;
        case 2:
          {
          int length=in.nextInt();
           int breadth=in.nextInt();
          int area2=length*breadth;
          System.out.print(area2);
          }break;
        case 3:
          {
          float base=in.nextFloat();
          float height=in.nextFloat();
          float area3=0.5f*base*height;
          System.out.print(area3);
          }break;
        case 4:
          {
          float radius=in.nextFloat();
          double area4=3.14d *radius*radius;
          System.out.print(area4);
          }}
          
      
      }
    }
