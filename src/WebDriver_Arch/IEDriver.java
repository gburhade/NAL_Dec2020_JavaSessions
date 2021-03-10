package WebDriver_Arch;

public class IEDriver implements WebDriver 
{
	
	public IEDriver()
	{
		System.out.println(" Launching IE browser ");
		System.out.println(" IE launched ");
	}
	
	@Override
	public void findElements() 
	{
	   System.out.println(" list of elements");	
	}

	@Override
	public void findElement(String locator) {

		System.out.println("locating element" + locator);
		System.out.println(" performing operation on located webelement");
	}

	@Override
	public void get(String URL) 
	{
	
		System.out.println(" Enter URL : " + URL);
		
	}

	@Override
	public String getTitle() 
	{
		System.out.println(" Getting page title ");
		return "Google";
	}

	@Override
	public void click() 
	{
	   System.out.println(" WebElement clicked ");	
	}

	@Override
	public void sendKeys() 
	{
	   System.out.println(" Entering value in text field ");	
	}

	@Override
	public void close() 
	{
	   System.out.println("closing the browser");	
	}
}
