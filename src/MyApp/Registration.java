package MyApp;

//POJO class- Plain old Java Object
public class Registration 
{
	private String firstName;
	private String lastName;
	private String emailId;
	private long phoneno;
	private String address;
	
	public Registration()
	{
		
	}
	
	//Parametrized Constructor
	public Registration(String firstName, String lastName, String emailId, long phoneno, String address) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneno = phoneno;
		this.address = address;
	 }
	
	public Registration(String firstName, String lastName, long phoneno) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneno = phoneno;
	}



	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//Method with Registration class referenced as parameter
	public static void doRegister(Registration register)
	{
		System.out.println(register.firstName + " : " + register.lastName + " : " +register.emailId + " : " + register.phoneno + " : " + register.address);
	}
	
	

}
