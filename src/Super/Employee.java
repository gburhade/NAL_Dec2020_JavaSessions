package Super;

//Access Modifier
//Public, Private, default and protected

public class Employee 
{
	public String empName;
	protected int empID;
	String deptNAme;
	private double salary;
	
	public void m1()
	{
		System.out.println("m1 Method");
	}
	
	private void m2()
	{
		System.out.println("m2 method");
	}
	
	protected void m3()
	{
		System.out.println("m3 method");
	}
	
	//default access modifier
	void m4()
	{
		System.out.println("m4 Method");
	}
	
	
	

	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		obj.empName = "Gaurav";
		obj.empID = 105;
		obj.salary = 24;
		obj.deptNAme = "IT";
		
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

}
