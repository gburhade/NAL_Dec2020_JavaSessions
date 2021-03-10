package WebDriver_Arch;

public interface WebDriver extends SearchContext
{
	
	@Override
	public void findElement(String locator);
	
	public void get(String URL);
	public String getTitle();
	public void click();
	public void sendKeys();
	public void close();
	
	//public void handleAlert();

}
