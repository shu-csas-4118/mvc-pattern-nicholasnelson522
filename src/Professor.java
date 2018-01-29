
public class Professor 
{
	private String firstname; 
	private String lastname;
	private String email; 
	private String phonenumber; 
	
	public Professor(String firstname, String lastname, String email, String phonenumber)
	{
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
		this.setPhonenumber(phonenumber);
	}
	
	public void printName()
	{
		System.out.print(this.firstname + " " + this.lastname);
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

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
}
