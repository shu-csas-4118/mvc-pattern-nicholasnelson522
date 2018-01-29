import java.util.ArrayList;
import java.util.List;

public class MyMvcDemo 
{

	public static void main(String[] args) 
	{
	 Student student = new Student("Nick", "Nelson", 11040052,"nicholas.nelson@shu.edu");
	 StudentView studentview = new StudentView(); 
	 StudentControler studentcontroler = new StudentControler(student, studentview);
	 
		studentcontroler.printStudentDetails();
		
		
		Professor marco = new Professor ("Marco", "Morazan", "Marco.Morazan@shu.edu", "858-838-3945");
		Professor garett = new Professor ("Garett", "Chang", "Garett.Change@shu.edu", "858-832-3125");
		Professor thomas = new Professor ("Thomas" , "Marlowe", "Thomas.Marlowe@shu.edu", "858-867-3432");
		Professor wendiann = new Professor ("Wendiann", "Setti", "Wendiann.Setti@shu.edu", "858-458-3987");
		Professor moon = new Professor ("Moon", "Kim", "Moon.Kim@shu.edu", "858-312-7523");
		Professor vincente = new Professor("Vincente","Madina", "vincente.medina@shu.edu", "858-234-7659");
		
		Course c1 = new Course ("Intro Into Program Design I", 1114, 3, marco);
		Course c2 = new Course ("Intro Into Program Design II", 1115, 3, marco);
		Course c3 = new Course ("Software Engineering I", 4117, 3, thomas);
		Course c4 = new Course ("Software Engineering II", 4118, 3, garett);
		Course c5 = new Course ("Intro Into Statistics", 2111, 3, moon);
		Course c6 = new Course ("Developmental Math", 1004, 3, wendiann);
		Course c7 = new Course ("Symbolic Logic", 1204, 3, vincente);
		
		List<Course> catalog = new ArrayList<Course>();
		catalog.add(c1);
		catalog.add(c2);
		catalog.add(c3);
		catalog.add(c4);
		catalog.add(c5);
		catalog.add(c6);
		catalog.add(c7);
		
		RegestrationControler rc = new RegestrationControler(catalog);
		rc.printCatalog();
		
		
		student.regester(rc, c7);
		student.regester(rc, c1);
		studentcontroler.printStudentDetails();
		
		
		
	 

	}

}
