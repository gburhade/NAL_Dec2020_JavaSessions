package OOP_Encapsulation;

public class Company 
{
	
	public String name;
	private int sharePrice;
	private String policy;
	
	
	public void getCompAddress()
	{
		System.out.println("Company address swargate pune");
	}
	
	public void getShareInformation()
	{
		getsharePrice();
	}
	

	private void getsharePrice()
	{
		System.out.println("share price info");
	}
	
}
