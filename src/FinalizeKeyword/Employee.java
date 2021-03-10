package FinalizeKeyword;

public class Employee {
	
	@Override
	public void finalize()
	{
		System.out.println("This is Employee class finalize method");
	}

	public static void main(String[] args) 
	{
		System.out.println("Emp Class");
		
		Person p = new Person();
		p =null;

		Employee e = new Employee();
		e = null;
		
		//calling garbage collector
		System.gc();
		
		System.out.println("Emp Class is done");

	}

}
