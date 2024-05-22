package adapter;

public class ClgStudent {
  String studentName;
  String studentLastName;
  String StudentEmailId;

  public ClgStudent(String studentName, String studentLastName, String studentEmailId) {
    this.studentName = studentName;
    this.studentLastName = studentLastName;
    StudentEmailId = studentEmailId;
  }

  public String getStudentName() {
    return studentName;
  }

  public String getStudentLastName() {
    return studentLastName;
  }

  public String getStudentEmailId() {
    return StudentEmailId;
  }
}
