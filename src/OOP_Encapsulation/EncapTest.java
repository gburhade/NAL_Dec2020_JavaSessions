package OOP_Encapsulation;

public class EncapTest {

	public static void main(String[] args) 
	{
		EncapConcept obj = new EncapConcept();
		obj.name = "peter";
		obj.id = 101;
		
		obj.setSalary(30000);
		
		int sal = obj.getSalary();
		System.out.println(sal);

	}

}
