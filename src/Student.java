import java.util.ArrayList;
import java.util.List;

public class Student 
{
	private String firstname; 
	private String lastname;
	private String email; 
	private int idNumber; 
	private List<Course> courses = new ArrayList<Course>();

	
	public Student(String firstname, String lastname, int idNumber, String email)
	{
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setIdNumber(idNumber);
		this.setEmail(email);
	}
	public Student(String firstname, String lastname, int idNumber, String email, List<Course> cources)
	{
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setIdNumber(idNumber);
		this.setEmail(email);
		this.setCourses(cources);
		
	}

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}

	public int getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) 
	{
		this.courses = courses;
	}
	public void addCourse(Course course)
	{
		this.courses.add(course);
	}
	public void regester(RegestrationControler rc, Course course)
	{
			rc.regester(this, course);	
	}
}
