package JavaSessions;

public class GarbageCollector 
{

	public static void main(String[] args) 
	{
		new GarbageCollector(); //no referenced object
		
		GarbageCollector g = new GarbageCollector();
		g = null;
		
		//Programmer can call garbage collector using following statement
		System.gc();

	}

}
