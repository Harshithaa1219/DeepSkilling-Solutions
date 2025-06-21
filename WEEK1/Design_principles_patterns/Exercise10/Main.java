package WEEK1.Design_principles_patterns.Exercise10;

public class Main {
  public static void main(String[] args) {
    Student s=new Student(" a49","Harshitha","A");
    StudentView sv=new StudentView();
    StudentController sc=new StudentController(s, sv);
    sc.update();
    sc.setStudentName(" Rajamuri Harshitha");
    sc.setStudentGrade(" A++");
    System.out.println(" updated student details");
    sc.update();

  }
}