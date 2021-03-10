package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) 
	{
		
		EcommApp shop = new EcommApp();
		
		shop.login("gaurav@gmail.com","User@123")
		.doSearch("Macbook")
		.selectProduct("Macbook")
		.addtoCart("Macbook")
		.doPayment("ICICI BANK XX4523", "Test@123")
		.sentEmail("gaurav@nium.com")
		.logout()
		.login()
		.doSearch("Casual T Shirts")
		.logout();
		
		shop.login()
		.doPayment("AXIS BANK 78855466", "User@123")
		.logout();
		
		int oid = shop.generateOrderID();
		System.out.println(oid);
		
		shop.login()
		.logout();
		
		
		
	}

}
