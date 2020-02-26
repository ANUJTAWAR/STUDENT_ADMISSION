package Student_addmission;

public class StudentDetails {
  private String Student_Name;
  private int Student_Age;
  private String Student_Gender;
  private long Student_mobile_no;
  private String Student_Address;
  private String Course_name;
  void showDetails()
  {
	System.out.println("STUDENT NAME -"+getStudent_Name());
	System.out.println("STUDENT AGE -:"+getStudent_Age());
	System.out.println("STUDENT GENDER -:"+getStudent_Gender());
	System.out.println("STUDENT MOBILE_NO -:"+getStudent_mobile_no());
	System.out.println("STUDENT ADDRESS -:"+getStudent_Address());
	System.out.println("STUDENT COURSE_NAME -:"+getCourse_name());
	System.out.println("------------------------------------------------------------------------");
	System.out.println();
  } 
public String getStudent_Name() {
	return Student_Name;
}
public void setStudent_Name(String student_Name) {
	Student_Name = student_Name;
}
public int getStudent_Age() {
	return Student_Age;
}
public void setStudent_Age(int student_Age) {
	Student_Age = student_Age;
}
public String getStudent_Gender() {
	return Student_Gender;
}
public void setStudent_Gender(String student_Gender) {
	Student_Gender = student_Gender;
}
public String getStudent_Address() {
	return Student_Address;
}
public void setStudent_Address(String student_Address) {
	Student_Address = student_Address;
}
public long getStudent_mobile_no() {
	return Student_mobile_no;
}
public void setStudent_mobile_no(long student_mobile_no) {
	Student_mobile_no = student_mobile_no;
}
public String getCourse_name() {
	return Course_name;
}
public void setCourse_name(String course_name) {
	Course_name = course_name;
}
  

}
