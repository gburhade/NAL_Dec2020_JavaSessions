package JavaSessions;

public class Employee 
{
	String name;
	int age;
	int empID;
	double salary;

	public static void main(String[] args) 
	{
		//Object of employee class  : new keyword
		//name of object = e1 and object is 'new Employee()'
         Employee e1 = new Employee();
         e1.name = "Tom";
         e1.age = 26;
         e1.empID = 101;
         e1.salary = 456.23;
         
         System.out.println(e1.name + " "  + e1.age + " " + e1.empID + " " + e1.salary);
         
         Employee e2 = new Employee();
         e2.name = "Gaurav";
         e2.age = 29;
         
         System.out.println(e2.name + " "  + e2.age + " " + e2.empID + " " + e2.salary); // Gaurav 29 0 0.0
         
         Employee e3 = new Employee();
         System.out.println(e3.name + " "  + e3.age + " " + e3.empID + " " + e3.salary); // null  0  0  0.0


		
		
	}

}
