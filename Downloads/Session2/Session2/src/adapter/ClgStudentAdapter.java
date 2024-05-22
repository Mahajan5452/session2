package adapter;

public class ClgStudentAdapter implements Student{
  ClgStudent clgStudent ;

  public ClgStudentAdapter(ClgStudent clgStudent) {
    this.clgStudent = clgStudent;
  }

  @Override
  public String getName() {
    return clgStudent.getStudentName();
  }

  @Override
  public String getLastName() {
    return clgStudent.studentLastName;
  }

  @Override
  public String getEmailId() {
    return clgStudent.getStudentEmailId();
  }
}
