package OOP_Interface;


//Interface - USMedical

public interface USMedical extends WHO, UNHO
{
	int min_fee = 10;
	//Variables in interfaces are Static and Final by default
	
	public void cardicServices();
	public void orthoServices();
	public void pediaServies();
	
	@Override
	public void healthFund();
	
	//After JDK 1.8
	//1.Interface can have Method Body with static methods
	
	public static void bloodTest()   // static methods cannot be overriden
	{
		System.out.println(" US MEdical - bloodtest");
	}

	
	//2.can have one default method in interface
	default void billing()
	{
		System.out.println(" US Medical - Billing");
	}
}
