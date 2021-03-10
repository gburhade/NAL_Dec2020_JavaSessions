package superKeyword;

public class BMW extends Car
{
	String name;
	int price;
	
	public BMW()
	{
		super("BMW 520d", 40);
		//System.out.println("BMW --> default Constructor");
		
	}
	
	public BMW(String name, int price)
	{
		super(name,price);
		this.name = name;
		this.price = price;
		System.out.println(super.name);
	    System.out.println(super.price);	
	}
	

}
