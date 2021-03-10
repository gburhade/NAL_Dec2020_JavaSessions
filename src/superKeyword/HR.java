package superKeyword;

public class HR extends Department
{
	String deptName = "Human Resources"; 
	
	public void getDeptName()
	{
		System.out.println("Child Class Department Method");
	}

	public void getDepInfo()
	{
		//Method Chaining
		getDeptName();
		
		//To access parent class variables, methods without creating object of parent class
		//we used super keyword
		super.getDeptName();
		
	}
	
}
