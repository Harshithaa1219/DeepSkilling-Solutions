package WEEK1.Design_principles_patterns.Excercise1.Implementing_the_singleton_pattern;
public class Logger {
  private static Logger instance;
  private Logger()
  {
    System.out.println("Logger instance created");
  }
  public static Logger getInstance()
  {
    if(instance==null)
    {
      instance=new Logger();
    }
    return instance;
  }
  public void log(String message)
  {
    System.out.println("Log"+message);
  }
  
}
