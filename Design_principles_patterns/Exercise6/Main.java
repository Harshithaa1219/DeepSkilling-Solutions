package Exercise6;
  public class Main {
  public static void main(String[] args) {
    Image i1=new Proxy("dog.png");
    System.out.println("image object created but not yet loaded");
    System.out.println("first time display:");
    i1.display();
    System.out.println("second time display");
    i1.display();//caching

  }
}
