package superKeyword;

public class Car 
{
	String name;
	int price;
	protected int wheels;
	
	public Car() 
	{
	    System.out.println("Car --> default Constructor");	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car(String name, int price) 
	{
		this.name = name;
		this.price = price;
	}
	
	

	
	
	
}
