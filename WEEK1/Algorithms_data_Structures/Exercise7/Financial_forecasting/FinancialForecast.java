package Exercise7.Financial_forecasting;

public class FinancialForecast {
  public static double calculateFutureValue(double presentVal,double rate,int years)
  {if(years==0)
    {
      return presentVal;
    }
    return calculateFutureValue(presentVal*(1+rate),rate,years-1);
  }
  public static void main(String[] args) {
    double presentVal=1000;
    double rate=0.1;
    int years=5;
    double futureVal=calculateFutureValue(presentVal, rate, years);
    System.out.printf("Future value after %d years: %.2f\n",years,futureVal);
  }


  
}
