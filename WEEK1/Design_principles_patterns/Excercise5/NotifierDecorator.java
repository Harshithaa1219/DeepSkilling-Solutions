package WEEK1.Design_principles_patterns.Excercise5;

public class NotifierDecorator implements Notifier {
  protected Notifier notifier;
  public NotifierDecorator(Notifier notifier)
  {
    this.notifier=notifier;
  }
  public void send(String message)
  {
    notifier.send(message);
  }

  
}
