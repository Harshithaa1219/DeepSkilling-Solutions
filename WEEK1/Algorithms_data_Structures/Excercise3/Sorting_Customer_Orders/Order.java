package WEEK1.Algorithms_data_Structures.Excercise3.Sorting_Customer_Orders;

public class Order {
  int orderid;
  String customer_name;
  double Totalprice;
  public Order(int orderid,String customer_name,double Totalprice)
  {
    this.orderid=orderid;
    this.customer_name=customer_name;
    this.Totalprice=Totalprice;
    
  }
  //here i have used toString method because java automatically calls order.toString() INTERNALLY
  public String toString()
  {
    return "OrderId:"+orderid+",Name: "+customer_name+"total price: "+Totalprice;

  }
  
}
