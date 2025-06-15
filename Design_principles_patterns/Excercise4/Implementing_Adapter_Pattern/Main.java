package Excercise4.Implementing_Adapter_Pattern;

public class Main {
  public static void main(String[] args) {
    PayPalGateway paypal=new PayPalGateway();
    PaymentProcessor paypalProcessor=new PayPalAdapter(paypal);
    paypalProcessor.processPayment((15000));
    //stripe payment
    StripeGateway stripe=new StripeGateway();
    PaymentProcessor stripeProcessor=new StripeAdapter(stripe);
    stripeProcessor.processPayment(2500);

  }
  
}
