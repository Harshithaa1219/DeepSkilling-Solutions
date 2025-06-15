package Excercise4.Implementing_Adapter_Pattern;

public class StripeGateway {
  public void doTransaction(double money)
  {
    System.out.println("paid $ "+money+"using stripe");
  }
  
}
