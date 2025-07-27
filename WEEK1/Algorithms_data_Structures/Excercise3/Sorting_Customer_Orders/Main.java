package Excercise3.Sorting_Customer_Orders;

public class Main {
  public static void main(String[] args) {
    Order[] orders={new Order(1, "harshitha",600.0),
    new Order(2,"rahul", 1200),
    new Order(3, "Anu", 2000)

  };
  System.out.println("before sorting");
  for(Order order:orders)
  {
    System.out.println(order);
  }
  Sort.bubbleSort(orders);
  System.out.println("\n after sorting");
  for(Order order:orders)
  {
    System.out.println(order);
  }
  orders = new Order[]{
            new Order(1, "Harshitha", 600.0),
            new Order(2, "Rahul", 1200.0),
            new Order(3, "Anu", 450.0),
            new Order(4, "Kiran", 2000.0)
        };
        Sort.quickSort(orders,0,orders.length-1);
        System.out.println("\n after quick sort");
        for(Order order:orders)
        {
          System.out.println(order);
        }

  }
  
}
