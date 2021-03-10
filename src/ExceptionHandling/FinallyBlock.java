package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		
		System.out.println("A");
		try
		{
			int i = 9/3;
		}
		

		finally
		{
			System.out.println("Bye....");
			System.out.println("Finally block");
		}
		
		System.out.println(getMarks("Peter"));
		
	}
	
	
	public static int getMarks(String name)
	{
		if(name.equals("Tom"))
		{
			return 50;
		}
		else if(name.equals("Peter"))
		{
		
			try
			{
					int i = 9/0;
					return 90;
			}
			catch(Exception e)
			{
				return 20;
			}
			
			finally
			{
				System.out.println("Inside Finally Block");
			    return 45;
			}
			
		}
		
		else if(name.equals("jack"))
		{
			return 70;
		}
		else
			return -1;
			
		
		
	}

}
