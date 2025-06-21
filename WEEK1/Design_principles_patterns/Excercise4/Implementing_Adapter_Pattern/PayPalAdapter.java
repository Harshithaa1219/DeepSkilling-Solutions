package WEEK1.Design_principles_patterns.Excercise4.Implementing_Adapter_Pattern;

public class PayPalAdapter implements PaymentProcessor{
  private PayPalGateway paypal;
  public PayPalAdapter(PayPalGateway paypal)
  {
    this.paypal=paypal;
  }
  public void processPayment(double amount)
  {
    paypal.makePayment(amount);
  }

  
}
