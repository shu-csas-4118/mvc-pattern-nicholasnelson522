import java.util.ArrayList;
import java.util.List;

public class RegestrationControler 
{
	private List<Course> catalog = new ArrayList<Course>();
	
	public RegestrationControler(List<Course> courses) 
	{
		this.addCourses(courses);
		
	}
	public void regester(Student student, Course course)
	{
		if (catalog.contains(course))
			student.addCourse(course);
		
	}
	public void addCourses(List<Course> courses)
	{
		for (int i = 0; i < courses.size(); i++)
		{
			catalog.add(courses.get(i));
		}
	}
	public void printCatalog() 
	{
		
		System.out.println("Course catalog is as follows:");
		for (int i = 0;i < this.catalog.size();i++)
		{
			CourseView cv = new CourseView(this.catalog.get(i));
			cv.printCourseDetails();
			System.out.println();
			System.out.println();
		}
	}
	public void printStudentCourses() 
	{
		
		for (int i = 0;i < this.catalog.size();i++)
		{
			CourseView cv = new CourseView(this.catalog.get(i));
			cv.printCourseDetails();
			System.out.println();
			System.out.println();
		}
	}
	
 
}
