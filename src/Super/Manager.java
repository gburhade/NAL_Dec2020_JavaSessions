package Super;

public class Manager extends Employee{

	public static void main(String[] args) 
	{
		
		Manager obj = new Manager();
		obj.empName = "naveen";
		obj.deptNAme = "IT";
		obj.empID = 1500;
		
		obj.m3();
		
		Employee e1 = new Employee();
		e1.m3();

	}

}
