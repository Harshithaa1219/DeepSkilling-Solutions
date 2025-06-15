package Excercise1.Inventory_Management_System;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    InventoryManager manager=new InventoryManager();
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      System.out.println("\n---Inventory menu----");
      System.out.println("1.Add Product");
      System.out.println("2.update product");
      System.out.println("3.delete product");
      System.out.println("4.view all products");
      System.out.println("5.exit");
      System.out.println("choose an option");
      int choice=sc.nextInt();
      sc.nextLine();
      switch(choice)
      {
        case 1:
        System.out.print("enter the product id:");
        String id=sc.nextLine();
        System.out.print("enter the product name");
        String name=sc.nextLine();
        System.out.print("enter the quantity");
        int qty=sc.nextInt();
        System.out.print("enter the prcie");
        double price=sc.nextDouble();
        sc.nextLine();
        Product p=new Product(id,name,qty,price);

        manager.addProduct(p);
        break;
        case 2:
        System.out.println("enter product id to update");
        String uid=sc.nextLine();
        System.out.println("enter the new name");
        String newName=sc.nextLine();
        System.out.println("enter the quantity");
        int newqty=sc.nextInt();
        System.out.println("enter the new price price");
        double newPrice=sc.nextDouble();
        sc.nextLine();
        manager.updateProduct(uid, newName, newqty, newPrice);
        case 3:
        System.out.println("enter product id to delete");
        String del_id=sc.nextLine();
        manager.deleteProduct(del_id);
        break;
        case 4:
        manager.viewAllProducts();
        break;
        case 5:
        System.out.println("exiting...");
        sc.close();
        return;
        default:
        System.out.println("invalid choice");



        


      }

    }
  }

}
