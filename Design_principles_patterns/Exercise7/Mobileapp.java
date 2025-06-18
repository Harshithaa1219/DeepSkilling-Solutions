package Exercise7;

public class Mobileapp implements Observer {
  private String appName;
  public Mobileapp(String appName)
  {
    this.appName=appName;
  }
  public void update(String stockName,double stockPrice)
  {
    System.out.println(appName+"recevied update: "+stockName+" is now rupees"+stockPrice);
  }
  
}
