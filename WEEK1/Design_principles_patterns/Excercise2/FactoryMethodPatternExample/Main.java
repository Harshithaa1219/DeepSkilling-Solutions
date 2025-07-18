package WEEK1.Design_principles_patterns.Excercise2.FactoryMethodPatternExample;

public class Main {
  public static void main(String[] args) {
    DocumentFactory wordFactory = new WordDocumetFactory();
    Document wordDoc = wordFactory.createDocument();
    wordDoc.open();

    DocumentFactory pdfFactory = new PdfDocumentFactory();
    Document pdfDoc = pdfFactory.createDocument();
    pdfDoc.open();

    DocumentFactory excelFactory = new ExcelDocumentFactory();
    Document excelDoc = excelFactory.createDocument();
    excelDoc.open();
  }
}
