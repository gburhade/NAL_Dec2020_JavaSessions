package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) 
	{
       final  int days =7; // Constant value
		System.out.println(days * 100);
		
		  BMW b = new BMW();
		  
		  b.start(); // Overriden method from Child BMW class
		  b.stop(); // Parent Class
		  b.refuel(); // Parent Class
		  b.autoParking(); // Child class own method
		  b.engine();
		  
		  Car c = new Car();
		  c.start();
		  c.stop();
		  c.refuel();
		  c.engine();
		  
		  //child class object i.e new BMW() is referred by Parent class referenced variable
		//Top Casting
		  Car c1 = new BMW();
		  //Top Casting of GrandParent Vehicle class and Child BMW Class
		  Vehicle v1 = new BMW();
		  //v1.autoParking -  not accessible due to referenced type check
		  
		  c1.start(); // overriden method of BMW class
		  c1.stop(); // parent class
		  c1.refuel(); // parent class
		//  c1.autoParking  - error Referenced type check
		  
		  System.out.println("-------------------------------");
		  
		  
		  //down casting - Parent class object is referred by child class ref variable
	     BMW b1 = (BMW) new Car();     //classcast exception
		  //downcasting -  GrandParent class object is referred by child class ref variable
		 BMW b2 =  (BMW)new Vehicle(); //classcast exception
		  

	}

}
