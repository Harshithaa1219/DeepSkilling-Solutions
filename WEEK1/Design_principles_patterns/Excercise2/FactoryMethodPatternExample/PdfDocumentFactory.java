package WEEK1.Design_principles_patterns.Excercise2.FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory{
  public Document createDocument()
  {
    return new PdfDocument();
  }
  
}
