package ExceptionHandling;

public class ThrowsKeyword 
{
	public void m1() throws ArithmeticException
	{
		System.out.println("M1 method");
		m2();
	}
	
	public void m2() throws ArithmeticException
	{
		System.out.println("M2 method");
		m3();
	}
	
	public void m3() throws ArithmeticException
	{
		System.out.println("M3 method");
		m4();
	}

	public void m4() 
	{
		System.out.println("M4 method");
		try
		{
		booking();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void booking() throws ArithmeticException
	{
		System.out.println(" Booking Method");
		
		int i = 9/0;
	}
	
	

	//main method should never throw exception to JVM
	public static void main(String[] args) throws Exception
	{
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		

	}

}
