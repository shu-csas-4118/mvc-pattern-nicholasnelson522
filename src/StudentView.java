
public class StudentView 
{
	private Student student; 
	public StudentView(Student student)
	{
		this.student = student;
	}
	public StudentView()
	{
		
	}
	public void printStudentDetails(Student student) 
	{
		this.student = student;
		printStudentDetails();
	}
	public void printStudentDetails() 
	{
		if(this.student == null) 
		{
			throw new IllegalArgumentException("student");
		}
		System.out.println("Student's first name is : " + this.student.getFirstname());
		System.out.println("Student's last name is : " + this.student.getLastname());
		System.out.println("Student's idNumber name is : " + this.student.getIdNumber());
		System.out.println("Student's email is : " + this.student.getEmail());
		System.out.println("Student's courses are : ");
		RegestrationControler rc = new RegestrationControler(this.student.getCourses());
		rc.printStudentCourses();
		
		
		
	}

}
