package Excercise5;

public class Main {
  public static void main(String[] args) {
    Notifier emailnotifier=new EmailNotifier();
    Notifier smsAndSlackNotifer=new SlackNotiferDecorator(
      new SMSNotifierDecorator(emailnotifier)
    );
    smsAndSlackNotifer.send("you have a new alert");
  }
  
}
