package Exercise9;

public class Main {
  public static void main(String[] args) {
    Light light=new Light();
    Command lighton=new LightOnCommand(light);
        Command lightoff=new LightOnCommand(light);
        RemoteControl remote=new RemoteControl();
        System.out.println("turning light on");
        remote.setCommand(lighton);
        remote.pressButton();
        System.out.println("turning ligjt off");

        remote.setCommand(lightoff);
        remote.pressButton();



  }
  
}
