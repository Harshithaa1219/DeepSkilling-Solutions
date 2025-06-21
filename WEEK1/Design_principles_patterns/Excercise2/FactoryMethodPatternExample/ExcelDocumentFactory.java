package WEEK1.Design_principles_patterns.Excercise2.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory{
  public Document createDocument()
  {
    return new ExcelDocumet();

  }
  
  
}
