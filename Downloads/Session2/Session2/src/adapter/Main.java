package adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    SchoolStudent schoolStudent = new SchoolStudent("a","b","xyz@gmail.com");
    ClgStudent clgStudent = new ClgStudent("x","y","z@gmail.com");
    studentList.add(schoolStudent);
//    studentList.add(clgStudent);
    // as i am trying to add clg student to list it will not add as ut is not the instance of Student
    // so i need to make it compatible to student interface by making a adapter
    studentList.add(new ClgStudentAdapter(clgStudent));

  }
}
