package Excercise2.eCommerce_search_functionality;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    Product[] products={
      new Product("p10", "ipad", "electornics"),
      new Product("p11", "shirt", "electornics"),
      new Product("p12", "shirt", "clothing"),
      new Product("p13", "books", "Stationary"),
      new Product("p14", "shoes", "footwear")

    };
    System.out.println("enter the product name to search");
    String target=sc.nextLine();
      sc.close();

    int lindex=Search.linearSearch(products, target);
    if(lindex!=-1)
    {
      System.out.println("linear search  found at index"+lindex);
    }
    else{
      System.out.println("linear search:not found");
    }
    Arrays.sort(products,Comparator.comparing(Product::getProductName,String.CASE_INSENSITIVE_ORDER));
    int binaryIndex=Search.binarySearch(products,target,0,products.length-1);
    if(binaryIndex!=-1)
    {
      System.out.println("binary search:found at index"+binaryIndex);

    }
    else{

      System.out.println("binary search:not found");
    }

  }
  
}
