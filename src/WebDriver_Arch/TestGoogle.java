package WebDriver_Arch;

public class TestGoogle 
{
	//when variable is declared as static then it automatically get initialized to default values
	static WebDriver driver;

	
	public static void main(String[] args) 
	{
		String browser = "Safari";
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		 //IEDriver driver = new IEDriver();
		
		//TopCasting : Cross browser testing
		
//		if(browser.equals("chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("firefox"))
//		{
//			driver = new FirefoxDriver();
//		}
//		else if(browser.equals("IE"))
//		{
//			driver = new IEDriver();
//		}
//		else
//		{
//			System.out.println(" Please pass the correct browser name");
//		}
		
		switch (browser) 
		{
		   case "chrome":
			            driver = new ChromeDriver();
			             break;
			             
		   case "firefox":
			   			  driver = new FirefoxDriver();
			   			  break;
			   			  
		   case "IE":
			   				driver = new IEDriver();
			   				break;   			  

		   default:
			   		   System.out.println("Please pass the correct browser name");
			   			break;
		}
		
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(" Page title is : " + title);
		
		
		//Verification
        if(title.equals("Google"))
        {
        	System.out.println(" Correct Title");
        }
        else
        {
        	System.out.println(" Incorrect Title");
        }
        
        driver.findElement(" username");
        driver.sendKeys();
        driver.click();
        
        driver.close();
		

	}

}
