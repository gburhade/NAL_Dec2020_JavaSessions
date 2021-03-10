package OOP_AbstractClass;

public class LoginPage extends Page 
{
	
	public LoginPage()
	{
		System.out.println(" LoginPage Class Constructor..");
	}

	@Override
	public void title() {
		System.out.println(" Login page title ");
		
	}

	@Override
	public void header() {
        System.out.println(" Login Page Header ");		
	}

	@Override
	public void URL() {
      System.out.println("https://www.xyz.com/loginpage.jsp");		
	}
	
	public void loadingTimeout()
	{
		System.out.println(" Login page loading time is 10 secs");
	}
	
	
	public void doLogin()
	{
		System.out.println(" Do Login");
	}
	

}
