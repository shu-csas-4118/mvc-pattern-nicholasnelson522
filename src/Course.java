
public class Course 
{
	private String name; 
	private int number;
	private int credits;
	private Professor professor; 

public Course(String name, int number, int credits, Professor professor)
{
	this.setName(name);
	this.setNumber(number);
	this.setCredits(credits);
	this.setProfessor(professor);
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public int getNumber()
{
	return number;
}

public void setNumber(int number)
{
	this.number = number;
}

public int getCredits() 
{
	return credits;
}

public void setCredits(int credits) 
{
	this.credits = credits;
}

public Professor getProfessor() 
{
	return professor;
}

public void setProfessor(Professor professor) 
{
	this.professor = professor;
}

}