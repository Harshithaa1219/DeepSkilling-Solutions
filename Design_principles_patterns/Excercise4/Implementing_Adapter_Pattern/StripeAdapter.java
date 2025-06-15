package Excercise4.Implementing_Adapter_Pattern;

public class StripeAdapter implements PaymentProcessor{
  private StripeGateway stripe;
  StripeAdapter(StripeGateway stripe)
  {
    this.stripe=stripe;
  }
  public void processPayment(double amount){
    stripe.doTransaction(amount);
  }
}
