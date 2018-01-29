
public class CourseView 
{
	private Course course; 
	public CourseView(Course course)
	{
		this.course = course;
	}
	public CourseView()
	{
		
	}
	public void printCourseDetails(Course course) 
	{
		this.course = course;
		printCourseDetails();
	}
	public void printCourseDetails() 
	{
		if(this.course == null) 
		{
			throw new IllegalArgumentException("course");
		}
		System.out.println("Course name: " + this.course.getName());
		System.out.println("Course number: " + this.course.getNumber());
		System.out.println("Credits: " + this.course.getCredits());
		System.out.print("Professor: ");
		this.course.getProfessor().printName();
	}
		
}
