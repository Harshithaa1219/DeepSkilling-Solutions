package WEEK1.Design_principles_patterns.Excercise4.Implementing_Adapter_Pattern;

public class StripeGateway {
  public void doTransaction(double money)
  {
    System.out.println("paid $ "+money+"using stripe");
  }
  
}
