package WEEK1.Design_principles_patterns.Exercise8;

public class Main {
  public static void main(String[] args) {
    PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        context.makePayment(500.00);

        // Pay with PayPal
        context.setPaymentStrategy(new PaypalPayment("harshitha@example.com"));
        context.makePayment(1200.50);
  }
  
}
