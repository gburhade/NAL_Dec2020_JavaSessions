package MyApp;

public class Customer 
{

	public static void main(String[] args) 
	{
		Registration reg = new Registration("tom","peter","tom@gmail.com", 99999, "Bangalore");
	    //Method Calling with Object Referenced
		Registration.doRegister(reg);
		
		Registration reg1 = new Registration("Gaurav","Burhade",9563245);
		reg1.setEmailId("gaurav@gmail.com");
		reg1.setAddress("Nashik");
		Registration.doRegister(reg1);
		
		System.out.println(reg1.getEmailId());
		System.out.println(reg1.getAddress());

		//Top Casting
		Registration r = new SignIn();
		Registration.doRegister(r);
		
	}

}
