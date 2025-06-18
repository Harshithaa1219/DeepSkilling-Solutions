package Exercise8;

public class CreditCardPayment implements PaymentStrategy {
  private String cardno;
  public CreditCardPayment(String cardno)
  {
    this.cardno=cardno;

  }
  public void pay(double amount)
  {
            System.out.println("paid rupees "+amount+"using credit card ending with "+cardno.substring(cardno.length()-4));
  }
  {

  }
  
}
