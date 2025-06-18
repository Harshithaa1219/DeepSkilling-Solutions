package Exercise9;

public class RemoteControl {
  public Command command;
  public void setCommand(Command command)
  {
    this.command=command;
  }
  public void pressButton()
  {
    if(command!=null)
    {
      command.execute();
    }
    else{
      System.out.println("no command is assigned");
    }
  }
  
}
