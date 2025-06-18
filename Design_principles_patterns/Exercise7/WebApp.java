package Exercise7;

public class WebApp implements Observer{
  private String webAppName;
  public WebApp(String webAppName)
  {
    this.webAppName=webAppName;
  }
  public void update(String stockName,double stockPrice)
  {
    System.out.println(webAppName+"received update: "+stockName+"is now ruppes"+stockPrice);
  }


  
}
