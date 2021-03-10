package ExceptionHandling;

public class TryCatchBlock 
{
	String name;

	public static void main(String[] args) 
	{
		int base = 0;
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		try
		{
			TryCatchBlock obj = new TryCatchBlock();
			//obj = null;
			obj.name = "tom";
			System.out.println(obj.name);
		  int i = 9/base; //exception
		  System.out.println("bye");
		  System.out.println("bye");
		  System.out.println("bye");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(" Arithmetic exception is coming");
			e.printStackTrace();
		}
		
		catch(NullPointerException e) //NPE - Null Pointer Exception
		{
			System.out.println(" NullPointer exception is coming");
			e.printStackTrace();
		}
		
	
		
		System.out.println(" Hello ");
		System.out.println(" Hello ");
		System.out.println(" Hello ");
		
		
		
	}

}
