package superKeyword;

public class TestCar 
{

	public static void main(String[] args) 
	{
		//BMW b = new BMW();

		BMW b1 = new BMW("BMW 520d", 80);
		System.out.println(b1.name);
		System.out.println(b1.price);
	    
		Car c = new Car();
		
		//Using Getters and Setters
		c.setName("Audi A4");
		c.setPrice(40);
		System.out.println(c.getName() + " : " + c.getPrice());
		
		//Using TopCasting
		Car c1 = new BMW();
		System.out.println(c1.name + " : " + c1.price);
		
		
		
	  
	}

}
