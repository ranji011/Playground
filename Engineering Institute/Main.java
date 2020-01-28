import java.util.Scanner;

class Faculty
{
  int sal;
  public void salary()
  {
   System.out.println("Base Salary: "+sal) ;
  }
}
class CSE 
{
   Faculty obj = new Faculty();
  public void salary(Faculty faculty)
  {
    this.obj=faculty  ;
    System.out.println("CSE Faculty: "+(obj.sal+3000));
  }
}
class IT 
{
  Faculty obj = new Faculty();
  public void salary(Faculty faculty)
  {
    this.obj=faculty  ;
    System.out.println("IT Faculty: "+(obj.sal+5000));
  }
}
class ECE 
{
  Faculty obj = new Faculty();
  public void salary(Faculty faculty)
  {
    this.obj=faculty  ;
    System.out.println("ECE Faculty: "+(obj.sal+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty ob = new Faculty();
    Scanner in=new Scanner(System.in);
    int salary=in.nextInt();
     ob.sal=salary;
     CSE obj = new CSE();
     IT obj1 = new IT();
     ECE obj2 = new ECE();
     ob.salary();
    obj.salary(ob);
    obj1.salary(ob);
    obj2.salary(ob);
  }
}