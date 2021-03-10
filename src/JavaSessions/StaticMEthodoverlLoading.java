package JavaSessions;

public class StaticMEthodoverlLoading 
{
	public static void test()
	{
		
	}
	
	public static  void test(int a, String s)
	{
		
	}
	
	public static  void test(String s , int a, )
	{
		
	}

	public static void main(String[] args) 
	{
		
		//static method can be overloaded
	   test();
	   test(10,"Gaurav");
	   test("Burhade", 50);

	}

}
