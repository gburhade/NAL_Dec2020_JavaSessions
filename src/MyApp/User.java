package MyApp;

public class User {

	public static void main(String[] args) 
	{
		Application app = new Application("admin","admin");
		app.doLogin();
		
		System.out.println("----------------------------------------");
		Application app1 = new Application();
		app1.setUsername("gaurav");//setters method
		app1.setPassword("gaurav@123");
		app1.doLogin();
		
		String un = app1.getUsername();
		System.out.println(un.equals("gaurav"));
		String pswd = app1.getPassword();
		System.out.println(pswd.equals("gaurav@123"));
	}

}
