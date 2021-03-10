package JavaSessions;

public class Customer 
{
	String name;
	String orderId;
	int custId;
	String city;
	boolean isActive;
	
	
	public Customer(String name, int custId)
	{
		//this keyword refer to current instance of object
		this.name = name;
		this.custId = custId; 
	}
	
	

	public Customer(String name, String orderId, int custId, String city, boolean isActive) {
		this.name = name;
		this.orderId = orderId;
		this.custId = custId;
		this.city = city;
		this.isActive = isActive;
	}


	public Customer(String name, String city) {
		this.name = name;
		this.city = city;
	}

	


	public Customer(String orderId, String city, int custId) {
		
		this.orderId = orderId;
		this.city = city;
		this.custId = custId;
	}



	public Customer(int custId, boolean isActive) {
		this.custId = custId;
		this.isActive = isActive;
	}



	public static void main(String[] args) 
	{
		Customer obj = new Customer("arun",1);
		System.out.println(obj.name);
		System.out.println(obj.custId);
		
		Customer obj2 = new Customer("peter","1531234", 150, "London", true);
		System.out.println(obj2.name + " " + obj2.custId + " " + obj2.orderId + " " + obj2.city + " " + obj2.isActive);
		
		Customer obj3 = new Customer("7890111", "washington", 101);
		System.out.println(obj3.orderId + " " + obj3.custId + " " + obj3.city + " " + obj3.name + " " + obj3.isActive);
	}

	
}
