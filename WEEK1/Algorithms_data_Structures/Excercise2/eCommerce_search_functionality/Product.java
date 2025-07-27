package WEEK1.Algorithms_data_Structures.Excercise2.eCommerce_search_functionality;

public class Product {
  private String product_id;
  private String product_name;
  private String category;
  public Product(String product_id,String product_name,String category)
  {
    this.product_id=product_id;
    this.product_name=product_name;
    this.category=category;
  }
  public String getProductId()
  {
    return product_id;
  }
  public String getProductName()
  {
    return product_name;
  }
  public String getProductCategory()
  {
    return category;
  }
  

  
}
