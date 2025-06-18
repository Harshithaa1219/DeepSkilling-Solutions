package Exercise7;

public class Main {
  public static void main(String[] args) {
    StockMarket stockMarket=new StockMarket();

    Observer mobileapp=new Mobileapp("harshitha mobile");
    Observer webApp=new WebApp("harshithas web app");
    stockMarket.registerObserver(mobileapp);
    stockMarket.registerObserver(webApp);
    System.out.println("updating stockprice.......");
    stockMarket.setStockData("tata",222220);
    System.out.println(" removing mobile app observer.....");
    stockMarket.removeObserver(mobileapp);
    System.out.println("updating stock prcie agai...n");
    stockMarket.setStockData("TATA", 2320000);


  }
  
}
