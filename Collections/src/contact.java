
enum Gender{
	Male,Female;
}

public class contact {
	Long phoneNumber;
	String name;
	String email;
	Gender gender;
	
	public contact(Long phoneNumber,String name,String email,Gender gender)
	{
		super();
		this.phoneNumber=phoneNumber;
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
	
	public String toString()
	{
		return "Name: "+name+" Email: "+email+" Gender:"+gender+" PhoneNumber:"+phoneNumber;
	}

}






