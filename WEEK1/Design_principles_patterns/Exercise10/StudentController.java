package WEEK1.Design_principles_patterns.Exercise10;

public class StudentController {
  private Student s;
  private StudentView sv;
  public StudentController(Student s,StudentView sv)
  {
    this.s=s;
    this.sv=sv;
  }
  //updating the mdoel
  public void setStudentId(String id)
  {
    s.setId(id);
  }
  public void setStudentName(String name)
  {
    s.setName(name);
  }
  public void setStudentGrade(String grade)
  {
    s.setGrade(grade);

  }
  //getting values from the model
  public String getStudentId()
  {
    return s.getId();
  }
  public String getStudentString(String grade)
  {
    return s.getGrade();
  }
  public String getStudentName(String name)
  {
    return s.getName();
  }
  //display updated students details through viwe
  public void update(){
    sv.displayStudentDetails(s.getId(),s.getName(),s.getGrade());
  }
  
}
