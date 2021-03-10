package OOP_Encapsulation;

public class EncapConcept 
{
	public String name;
	private int salary;   //private var scope only within the class
	private int age; // private var scope only within the class
	public int id;
	
	public int getSalary()  //getter method
	{
		return salary;
	}
	
	public void setSalary(int salary) //setter mthod
	{
		this.salary = salary;
	}

	public static void main(String[] args) 
	{

		EncapConcept obj = new EncapConcept();
		obj.name = "tom";
		obj.salary = 15000;
		obj.age = 20;
		obj.id = 2;
		
		System.out.println(obj.name + " " + obj.salary + " " + obj.age + " " + obj.id );
		
	}

}
