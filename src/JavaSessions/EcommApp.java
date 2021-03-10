package JavaSessions;

public class EcommApp 
{
	
	// Real time examples of Method Overloading
	
	//1.ecommerce app like flipkart, amazon - search filter
	public void search()
	{
		System.out.println("default search on flipkart");
	}
	
	public void search(String modelname, int price)
	{
		System.out.println("search with " + modelname + " and " + price);
	}
	
	public void search(String modelname, int price, double ratings)
	{
		System.out.println("search with " + modelname + " , " + price + " and " + ratings);
	}
	
	
	//2.payment using different available ways - upi id, debit, credit card
	
	public void payment(String upiID)
	{
		System.out.println("Pay with " + upiID);
	}
	
	
	public void payment(String cc, int otp, int cvv)
	{
		System.out.println("Pay with " + cc + " , " + otp + " and " + cvv);
	}
	
	public void payment(String dc, int otp, String me, String de)
	{
		System.out.println(" Pay with " + dc + " " + otp + " " + me + " " + de);
	}

	//3. booking UBER Cab
	public void bookingCab(String st, String ep)
	{
		System.out.println(" Starting pt : " + st + " ending pt " + ep);
	}
	
	
	public String  bookingCab(String st, String ep, String carType)
	{
		System.out.println(" Starting pt : " + st + " ending pt " + ep + " car type " + carType);
		return "booked";
	}
	
	public boolean bookingCab(String st, String ep, String carType, double rating)
	{
		System.out.println(" Starting pt : " + st + " ending pt " + ep + " car type " + carType + " rating " + rating);
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		EcommApp ea = new EcommApp();
		ea.search("redminote7pro", 15000);
		ea.search("oneplus7t", 38000, 4.0);
		ea.payment("gauravburhade@canarabak.com");
		ea.payment("56423165489713", 345, "04", "2030");
		String val = ea.bookingCab("nashik", "pune", "Premium sedan");
		System.out.println(val);
		
		boolean res = ea.bookingCab("N", "M", "Sntro", 5.0);
		System.out.println(true);

	}

}
