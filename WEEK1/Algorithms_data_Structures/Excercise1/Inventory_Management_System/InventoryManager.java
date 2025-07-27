package Excercise1.Inventory_Management_System;

import java.util.HashMap;

public class InventoryManager {
  private HashMap<String,Product>inventory=new HashMap<>();
  public void addProduct(Product product)
  {
    if(inventory.containsKey(product.getProductId()))
    {
      System.out.println("product id already exists");
    }
    else{
      inventory.put(product.getProductId(),product);

      System.out.println("product added successfully");
    }
  }
  public void updateProduct(String product_id,String newName,int newQuantity,double newPrice)
  {
    if(inventory.containsKey(product_id))
    {
      Product product=inventory.get(product_id);
      product.setProductName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found.");
        }

    }
    public void deleteProduct(String product_id)
     {
        if (inventory.containsKey(product_id))
         {
            inventory.remove(product_id);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }
    public void viewAllProducts()
    {
      if(inventory.isEmpty())
      {
      System.out.println("inventory is empty");
      }
      else{
        for(Product p:inventory.values())
        {
          p.displayProduct();
        }
      }
    }


  }
  
  

