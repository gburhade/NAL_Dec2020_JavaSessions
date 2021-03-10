package JavaSessions;

public class Page 
{
	
	//static methods
	public static void t1()
	{
		System.out.println("static  - t1 method");
		t2();
		Page p1 = new Page();
		p1.launch();
	}
	
	public static void t2() 
	{
		System.out.println(" static - t2 method");
	}
	
	//non static methods
	 private void launch()
	{
		System.out.println(" launch");
		header();
		t1(); // when calling static method from non static method, we can directly call static method. no need to create object
	}
	
	 private void header()
	{
		System.out.println(" header ");
		title();
	}
	
	public void title()
	{
		System.out.println(" title ");
		close();
	}
	
	public void close()
	{
		System.out.println(" close ");
	}

	public static void main(String[] args) 
	{
		
		Page page = new Page();
		page.launch();
		//t1();

	}

}
