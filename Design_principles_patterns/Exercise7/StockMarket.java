package Exercise7;
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
private List<Observer>observers=new ArrayList<>();
private String stockname;
private double stockPrice;
public void registerObserver(Observer observer)
{
  observers.add(observer);
}
public void removeObserver(Observer observer)
{
  observers.remove(observer);

}
public void notifyObservers()
{
  for(Observer observer:observers)
  {
    observer.update(stockname, stockPrice);
  }
}
public void setStockData(String stockName,double stockPrice)
{
  this.stockname=stockName;
  this.stockPrice=stockPrice;
  notifyObservers();
}



  
}
