package WEEK1.Design_principles_patterns.Excercise1.Implementing_the_singleton_pattern;

public class Main {
  public static void main(String[] args) {
    Logger l1=Logger.getInstance();
    l1.log("this is first log");
    Logger l2=Logger.getInstance();
    l2.log("this is second log");
  
  if(l1==l2)
  {
System.out.println("same logger instance");
  }
  else
  {
    System.out.println("different instances");

  }
  
}
}
