package WEEK1.Design_principles_patterns.Exercise6;



public class Proxy implements Image{
  private RealImage real;
  private String filename;
  public Proxy(String filename)
  {
    this.filename=filename;
  }
  public void display()
  {

  
    if(real==null)//lazy intilization
    {
      real=new RealImage(filename);
    }
    real.display();
  }
}
