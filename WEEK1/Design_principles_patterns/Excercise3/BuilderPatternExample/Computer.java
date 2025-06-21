package WEEK1.Design_principles_patterns.Excercise3.BuilderPatternExample;


//builder pattern is used when we want to build complex objects step by step especially when  some fields are optional
public class Computer {
  private String CPU;
  private String RAM;
  //optional parameters
  private String storage;
  private String graphicsCard;
  private Computer(Builder builder)
  {
    this.CPU=builder.CPU;
    this.RAM=builder.RAM;
    this.storage=builder.storage;
    this.graphicsCard=builder.graphicsCard;

  }
  public void showConfig()
  {
    System.out.println("cpu: "+CPU);
    System.out.println("ram : "+RAM);
    System.out.println("storage: "+(storage!=null?storage:"Not Specified"));
    System.out.println("graphics card: "+(graphicsCard!=null?graphicsCard:"not specified"));
  }
  //now we create static inner class builder is created inside computer
  public static class Builder{
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    public Builder(String CPU,String RAM)
    {
      this.CPU=CPU;
      this.RAM=RAM;
    }
    public Builder setStorage(String storage)
    {
      this.storage=storage;
      return this;
    }
    public Builder setGraphicsCard(String graphicsCard)
    {
      this.graphicsCard=graphicsCard;
      return this;
    }
    public Computer build()
    {
      return new Computer(this);
    }
  }


  
}
