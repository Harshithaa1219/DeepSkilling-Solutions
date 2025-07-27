package WEEK1.Algorithms_data_Structures.Excercise2.eCommerce_search_functionality;

public class Search {
  public static int linearSearch(Product[] products,String targetName)
  {
    for(int i=0;i<products.length;i++)
    {
      if(products[i].getProductName().equalsIgnoreCase(targetName))
      {
        return i;

      }
    }
    return -1;
  }
  public static int binarySearch(Product[] products,String targetName,int left,int right)
  {
    if(left<=right)
    {
    int mid=(left+right)/2;
    int comparison=products[mid].getProductName().compareToIgnoreCase(targetName);
    if(comparison==0)
    {
      return mid;
    }
    else if(comparison<0)
    {
      return binarySearch(products, targetName, mid+1, right);
    }
    else
    {
      return binarySearch(products, targetName, left, mid-1);
    }


  }
      return -1;
}

  
}



