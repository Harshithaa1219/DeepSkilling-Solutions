package WEEK1.Design_principles_patterns.Excercise2.FactoryMethodPatternExample;

public class WordDocumetFactory extends DocumentFactory{
  public Document createDocument()
  {
    return new WordDocument();
  }

  
}
