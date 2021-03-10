package FinalizeKeyword;

public class Person 
{

	@Override
	public void finalize()
	{
		System.out.println("This is Person class finalize method");
	}
}
