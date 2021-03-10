package JavaSessions;

import java.util.ArrayList;

public class JavaPractice {

	public static void main(String[] args) throws Exception 
	{
		
		try
		{
			throw new Exception("Excel Data is Blank Exception");
		}                                                                                 
		catch(Exception e)
		{
			System.out.println("some exception is coming");
			e.printStackTrace();
		}

	}

	public static void add()
	{
		System.out.println("Add method");
	}
	
	public void callAdd()
	{
		add();
		System.out.println("call Add");
	}
	
	
}
