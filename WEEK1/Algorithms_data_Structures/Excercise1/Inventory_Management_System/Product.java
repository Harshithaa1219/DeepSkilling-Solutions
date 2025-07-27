package WEEK1.Algorithms_data_Structures.Excercise1.Inventory_Management_System;

public class Product {
  private String product_id;
  private String product_name;
  private int quantity;
  private double price;
  public Product(String product_id,String product_name,int quantity,double price)
  {
    this.product_id=product_id;
    this.product_name=product_name;
    this.quantity=quantity;
    this.price=price;
  }
  public void setProductName(String product_name)
   {
     this.product_name = product_name; 
    }
    public void setQuantity(int quantity)
     { 
      this.quantity = quantity; 
    }
    public void setPrice(double price) 
    { 
      this.price = price; 
    }
public String getProductId()
 { 
  return product_id; 
}
    public String getProductName() { 
      return product_name;
     }
    public int getQuantity() 
    { return quantity; 
    }
    public double getPrice()
     { 
      return price; 
    }
    public void displayProduct() {
        System.out.println("ID: " + product_id + ", Name: " + product_name + ", Quantity: " + quantity + ", Price: " + price);
    }
  }
