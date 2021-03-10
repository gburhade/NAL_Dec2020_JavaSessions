package JavaSessions;

public class Students 
{
	//1.Constructor help you in creation of object on basis of template variables
	//2.should have same name as classname
	//3.can be overloaded with same name and diff values
	
	public Students() //default constructor
	{
		System.out.println(" default constructor");
	}
	
	public Students(int a) //1 param constructor
	{
		System.out.println(" 1 param " + a);
	}
	
	public Students(String  a) //1 param constructor
	{
		System.out.println(" 1 param " + a);
	}

	public static void main(String[] args) 
	{
	
		Students obj = new Students();
		Students obj1 = new Students("gaurav");
		Students obj2 = new Students(15);
		

	}

}
