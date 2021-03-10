package OOP_Inheritance;

public  class Car  extends Vehicle //parent class
{
	
	  public  void start()
	  {
		  System.out.println("Car - start");
	  }
	  
	  //When method is declared with final keyword then that method cannot be overriden
	 // in any of classes
	  public final void stop()
	  {
		  System.out.println("Car - stop");
	  }
	  
	  public void refuel()
	  {
		  System.out.println("Car - refuel");
	  }
	  
	  public String test(int i, String name) 
	  {
		  System.out.println(" test method ");
		  return "pass";
	  }
	  
	  private void testing()
	  {
		  System.out.println(" testing ");
	  }
	  
	  public static void launch()
	  {
		  System.out.println(" launch method");
	  }

}
