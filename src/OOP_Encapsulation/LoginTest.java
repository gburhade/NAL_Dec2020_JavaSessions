package OOP_Encapsulation;

public class LoginTest {

	public static void main(String[] args) 
	{
		
//		LoginPage lp_customer = new LoginPage("gaurav@yopmail.com","user@123");
//		
////		lp.setUsername("gaurav123@yopmail.com");
////		lp.setPassword("Test@123");
//		lp_customer.doLogin(lp_customer.getUsername(), lp_customer.getPassword());
//		lp_customer.logout();
//		
//		System.out.println("----------------------------");
//		//seller login
//		
////		lp.setUsername("seller@gmail.com");
////		lp.setPassword("seller@123");
//		
//		LoginPage lp_seller = new LoginPage("seller@gmail.com","user@123");
//		
//		lp_seller.doLogin(lp_seller.getUsername(), lp_seller.getPassword());
//		lp_seller.logout();
		
		LoginPage lp = new LoginPage();
		lp.setUsername("naveen@gmail.com");
		lp.setPassword("test@123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		lp.logout();
		
		LoginPage lp1 = new LoginPage("shekhar1@yopmail.com", "user@123");
		lp1.doLogin(lp1.getUsername(), lp1.getPassword());
		lp1.logout();
		
	
	}

}
