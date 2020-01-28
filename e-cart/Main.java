import java.util.Scanner;

class Item
{
  private int price;
  public void setItemData(int price)
  {
  this.price=price; 
  }
  public int getItemData()
  {
  return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  public void setCustData(String product, int quantity)
  {
    this.product=product;
    this.quantity=quantity;
  }
  public int getCustData()
  {
  return quantity;
  }
}

class Bill extends Customer
{
  public void calculate(int price,int quantity)
  {
  int total=price*quantity;
  System.out.print("Total Price is : "+total);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    String product=in.nextLine();
    int price=in.nextInt();
    int quantity=in.nextInt();
    i.setItemData(price);
    c.setCustData(product,quantity);
    obj.calculate(price,quantity);
  }
}