package Excercise3.BuilderPatternExample;

public class Main {
  public static void main(String[] args) {
    Computer gamingPc=new Computer.Builder("intel", "16gb").setStorage("1tb ssd")
    .setGraphicsCard("nivida tx 3060")
    .build();
    Computer officePC = new Computer.Builder("Intel i3", "8GB").build();
    System.out.println("Gaming PC Configuration:");
        gamingPc.showConfig();
        System.out.println("\nOffice PC Configuration:");
        officePC.showConfig();
  }
  
}
