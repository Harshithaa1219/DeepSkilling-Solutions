package WEEK1.Design_principles_patterns.Exercise8;

public class PaymentContext {
  private PaymentStrategy strategy;
public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void makePayment(double amount) {
        if (strategy == null) {
            System.out.println("Payment method not set!");
        } else {
            strategy.pay(amount);
        }
  
      }
}
