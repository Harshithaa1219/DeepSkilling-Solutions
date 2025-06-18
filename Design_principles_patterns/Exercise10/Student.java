package Exercise10;

public class Student {
  
private String id;
  private String name;
  private String grade;
  public Student(String name, String id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
  public void setId(String id)
  {
    this.id=id;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setGrade(String grade)
  {
    this.grade=grade;
  }
  public String getId()
  
  {
    return id;
  }
  public String getName()
  
  {
    return name;
  }
  public String getGrade()
  
  {
    return grade;
  }

  

}

