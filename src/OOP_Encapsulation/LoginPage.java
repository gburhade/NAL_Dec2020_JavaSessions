package OOP_Encapsulation;

public class LoginPage 
{
	
	//private variables
	private String username;
	private String password;
	
	
	public LoginPage()
	{
		
	}
	
	
	public LoginPage(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	// public layer
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String username, String password)
	{
		System.out.println(" Entering username " + username);
		System.out.println(" Entering password " + password);
		System.out.println(" Clicking on login button ");
		System.out.println(" Login successful ");
		
	}
	
	public void logout()
	{
		System.out.println(" logout from the app.... ");
	}
	
	

}
