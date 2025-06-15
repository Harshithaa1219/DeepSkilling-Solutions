package Excercise5;

public class SlackNotiferDecorator extends NotifierDecorator {
  public SlackNotiferDecorator(Notifier notifier)
  {
    super(notifier);

  }
  public void send(String message)
  {
    super.send(message);
    System.out.println("sending slack message");
  }
  
}
