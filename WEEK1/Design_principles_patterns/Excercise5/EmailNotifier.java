package WEEK1.Design_principles_patterns.Excercise5;

public class EmailNotifier implements Notifier {
  public void send(String message)
  {
    System.out.println("Sending email: "+message);
  }
  
}
