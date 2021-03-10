package JavaSessions;

public class ConstructorConcept 
{
	int age;
	
	private ConstructorConcept() //scope of this private constructor is only within this class. Outside of this class, private constructor will not be accessible
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{

		ConstructorConcept cc = new ConstructorConcept();
		cc.age = 10;
		System.out.println(cc.age);
		
	}

}
