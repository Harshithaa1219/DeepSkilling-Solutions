package Exercise6;

public class RealImage implements Image {
  private String filename;
  public RealImage(String filename)
  {
    this.filename=filename;
    loadFromServer();
  }
  private void loadFromServer()
  {
    System.out.println("loading image form server");

  }
  public void display()
  {
    System.out.println("displaying image: "+filename);
  }

  
}