package Policy;

import Super.Employee;

//different package non sub class

public class Admin 
{

	public static void main(String[] args) 
	{
		Employee ee = new Employee();
		ee.empName= "Burhade";
		ee.m1();//only public variables and methods are available
		//ee.m2();
		

	}

}
