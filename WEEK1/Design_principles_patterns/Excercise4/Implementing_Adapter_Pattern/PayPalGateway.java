package WEEK1.Design_principles_patterns.Excercise4.Implementing_Adapter_Pattern;

public class PayPalGateway {
  public void makePayment(double amountInDollars)
  {
    System.out.println("paid $ "+amountInDollars);
  }
  
}
