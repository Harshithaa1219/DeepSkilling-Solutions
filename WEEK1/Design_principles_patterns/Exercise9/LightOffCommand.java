package WEEK1.Design_principles_patterns.Exercise9;

public class LightOffCommand implements Command{
  private Light light;
  public LightOffCommand(Light light)
  {
    this.light=light;
  }
  public void execute()
  {
    light.turnOff();

  }

  
}
