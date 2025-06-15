package Excercise2.FactoryMethodPatternExample;

public class WordDocumetFactory extends DocumentFactory{
  public Document createDocument()
  {
    return new WordDocument();
  }

  
}
