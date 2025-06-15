package Excercise5;

public class SMSNotifierDecorator  extends NotifierDecorator{
  public SMSNotifierDecorator(Notifier notifier)
  {
    super(notifier);
  }
  public void send(String message)
  {
    super.send(message);
    System.out.println("sending sms"+message);
    
  }
  
}
