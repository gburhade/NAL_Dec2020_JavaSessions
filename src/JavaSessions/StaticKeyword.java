package JavaSessions;

public class StaticKeyword 
{
	String name;
	static int age;
	
	public void test()
	{
		System.out.println(" test method");
	}
	
	public static void getMail()
	{
		System.out.println("get mail method");
	}

	public static void main(String[] args) 
	{
		//how to call staic variables and methods
		//1.way -  directly 
		//2.way - using Classname - this is recommended
		//3.way - using object name
		
		//1st approach
		age = 15;
		System.out.println(age);
		getMail();
		
		//2nd approach
		System.out.println(StaticKeyword.age);
		StaticKeyword.getMail();
		
		//3rd approach
		StaticKeyword obj = new StaticKeyword();
		obj.name = "tom";
		obj.test();
		
		obj.age = 18;
		obj.getMail(); 

	}

}
