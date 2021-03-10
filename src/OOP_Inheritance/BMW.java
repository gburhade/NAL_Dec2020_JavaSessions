package OOP_Inheritance;

//child class
public class BMW extends Car
{

	@Override
	public void start()
	{
		System.out.println("BMW - Start" );
	}
	

//	@Override
//	  public void stop()
//	  {
//		  System.out.println("Car - stop");
//	  }
	
	public void autoParking()
	{
		System.out.println("BMW - auto parking");
	}

	@Override
	  public String test(int i, String name) 
	  {
		  System.out.println(" test method ");
		  return "fail";
	  }
	
	// private methods cannot be overriden. this method is independent method of BMW class 
	  private void testing()
	  {
		  System.out.println(" testing ");
	  }
	
	  public static void launch()
	  {
		  System.out.println(" launch method");
	  }
	  
	  @Override
	  public void engine()
		{
			System.out.println(" BMW - engine ");
		}
	
}
