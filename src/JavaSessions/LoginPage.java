package JavaSessions;

public class LoginPage 
{
	//Method Overloading
	//Compile time polymorphism - coz compiler is gonna decide which methods to call at compile time
	// poly + morphism = multiple forms
	
	//1.within the class
	//2. have same method name
	//3.different parameters(different types)
	//4.different parameter sequence
	//5.return type
	
	
	public void login()
	{
		System.out.println("default login");
	}
	
	public void login(long phone)
	{
		System.out.println(" login with " + phone);
	}
	
	public void login(long phone, int otp)
	{
		System.out.println(" login with " + phone + " and " + otp);
	}
	
//	public void login(int otp , long phone)
//	{
//		System.out.println(" login with " + otp + " and " + phone);
//	}

	public void login(String  un , String  pswd)
	{
		System.out.println(" login with " + un + " and " + pswd);
	}

	
	
	public static void main(String[] args) 
	{
		LoginPage lp = new LoginPage();
		lp.login();
		lp.login(87986565);
		lp.login(80878121 , 123);
		lp.login("admin","admin@123");

	}

}
