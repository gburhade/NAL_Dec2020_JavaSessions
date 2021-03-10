package JavaSessions;

public class IfIfElseloop {

	public static void main(String[] args) 
	{
		
		//DEad code

		//As only if condition is going to be true everytime so else will never be executing so code in else part is dead code
//		if(true)
//		{
//			System.out.println("Hi");
//		}
//		else
//		{
//			System.out.println("bye");
//		}
		
		
		//1.If Loop
	    //Cross Browser Testing
//		String browser = "chrome";
//		if(browser.equals("chrome"))
//		{
//			System.out.println("launch chrome");
//		}
//		
//		if(browser.equals("firefox"))
//		{
//			System.out.println("launch firefox");
//		}
//		
//		if(browser.equals("ie"))
//		{
//			System.out.println("launch ie");
//		}
//		
//		if(browser.equals("opera"))
//		{
//			System.out.println("launch opera");
//		}
//		
//		if(browser.equals("safari"))
//		{
//			System.out.println("launch safari");
//		}
		
		
		
		//Problem with if statement - even if we are getting browser name in first 'if' statement 
		   //it will check in other 'if' loops also for browser name
		
		//2.If Else Loop
		
		String browser = "opera";
		
		if(browser.equals("chrome"))
		{
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("launch firefox");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("launch ie");
		}
		else if(browser.equals("opera"))
		{
			System.out.println("launch opera");
		}
		else
		{
			System.out.println("Please pass the correct browser name");
		}
		
		
		//Problem with if else loop
		//So if else loop work fine if browser name is identified in 1st if statement.
		 //However if browser name is at 3rd or last 'If' loop then it is going check unnecessary for other if statement till it reaches 3rd or last if statement. Consider if there 100 if else statement then
		 //in that case its going to check for 99 if statement and then at last 'if' statement it will get browser name. So Solution is SWITCH CASE LOOP with break;
		
		
	}

}
