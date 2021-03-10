package JavaSessions;

//WAF where you need to pass the browsername
//on the basis of browsername, launch the browser

public class Browser 
{
	
	public void launchBrowser(String browserName)
	{
		System.out.println("browser name is "+browserName); //CHROME
		//using switch case
		
		switch (browserName.toLowerCase())  //chrome
		{
		
		  case "chrome":
			                       System.out.println("launch Chrome");
		                           break;
		                           
		  case "ff":
                                 System.out.println("launch ff");
                                break;
              
		  case "ie":
                             System.out.println("launch ie");
                             break;

		default:
			          System.out.println("Please pass the correct browser nme");
		              	break;
		}
		
		
		//using if else loop
//		if(browserName.equalsIgnoreCase("chrome"))
//		{
//			System.out.println("Launch Chrome");
//		}
//		else if(browserName.equalsIgnoreCase("ff"))
//		{
//			System.out.println("Launch firefox");
//		}
//		else if(browserName.equalsIgnoreCase("ie"))
//		{
//			System.out.println("Launch ie");
//		}
//		else
//		{
//			System.out.println("Please pass the correct browser name");
//		}
		
		
	}

	
	
	public static void main(String[] args) 
	{

		Browser br = new Browser();
		br.launchBrowser("CHROME");
	}

}
