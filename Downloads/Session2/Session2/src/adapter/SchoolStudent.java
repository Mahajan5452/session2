package adapter;

public class SchoolStudent implements Student{
  String name ;
  String lastName;
  String emailId;

  public SchoolStudent(String name, String lastName, String emailId) {
    this.name = name;
    this.lastName = lastName;
    this.emailId = emailId;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public String getLastName() {
    return null;
  }

  @Override
  public String getEmailId() {
    return null;
  }
}
