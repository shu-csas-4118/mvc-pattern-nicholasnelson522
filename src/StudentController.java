
public class StudentControler 
{
	private StudentView studentview;
	private Student student; 
	
	public StudentControler(Student student, StudentView studentview)
	{
		this.student = student;
		this.studentview = studentview; 
	}
	
	public void printStudentDetails()
	{
		this.studentview.printStudentDetails(student);
	}
}
