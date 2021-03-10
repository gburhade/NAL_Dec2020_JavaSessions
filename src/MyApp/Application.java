package MyApp;

public class Application 
{
	//class level variables
	private String username;
	private String password;
	
	//default constructor
	public Application()
	{
		System.out.println("Application Default Constructor");
	}
	
	//Parametrized Constructor
	public Application(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	//getters
	public String getUsername() {
		return username;
	}

	//setters
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void doLogin()
	{
		System.out.println(" Login with " + username + " : "+ password);
	}

}
