package OOP_AbstractClass;

public class AmazonPageTest 
{

	public static void main(String[] args) 
	{
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.header();
		lp.URL();
		//lp.logo();
		Page.logo();
		lp.loadingTimeout();
		
		
		//Cannot create object of abstract class Page
		//Page p = new Page();  -   error
		
//		HomePage hp = new HomePage();
//		hp.title();
//		hp.header();
//		hp.URL();
//		hp.logo();

		
		//Top Casting
		// Child class object can be referred by Parent abstract class reference variable
		
		Page p = new LoginPage();
		p.header();
		p.URL();
		p.title();
		p.loadingTimeout();
		
		//DownCasting for abstract and their child classes cannot be achieved 
		//new Page();
		
		
	}

}
