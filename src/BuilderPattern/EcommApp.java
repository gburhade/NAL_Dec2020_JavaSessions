package BuilderPattern;

public class EcommApp 
{
	
	//Ecommerce Application
	
	//Builder Pattern - Every method in class will return current class object
	
	public EcommApp login()
	{
		System.out.println(" Default Login ");
		return this;  // this refers to current class object
	}
	
	public EcommApp login(String userName, String password)
	{
		System.out.println(" Login with : " + userName + " : " + password);
		return this;
	}
	
	
	public EcommApp doSearch(String productName)
	{
		System.out.println(" Search with : " + productName );
		return this;
	}
	
	
	public EcommApp doSearch(String productName, int price)
	{
		System.out.println(" Search with : " + productName + " and " + price);
		return this;
	}
	
	public EcommApp selectProduct(String productName)
	{
		System.out.println(" Selecting the " + productName);
		return this;
	}
	
	public EcommApp addtoCart(String product)
	{
		System.out.println(" Adding " + product + " to the cart");
		return this;
	}

	public EcommApp doPayment(String accountName, String password)
	{
		System.out.println(" Payment done with " + accountName + " : " +password);
		return this;
	}
	
	public int generateOrderID()
	{
		return 215321;
	}
	
	public EcommApp sentEmail(String id)
	{
		System.out.println(" Mail Sent to " + id);
		return this;
	}
	
	public EcommApp logout()
	{
		System.out.println(" Logout from Applications ");
		return this;
	}
	
}
