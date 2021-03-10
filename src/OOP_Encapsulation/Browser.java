package OOP_Encapsulation;

public class Browser 
{
	private int version;
	
	//setter method in encapsulation
	public void setVersion(int version)
	{
		this.version = version;
	}
	
	//getter method in encapsulation
	public int getVersion()
	{
		return version;
	}
	
	public void launchBrowser()
	{
		System.out.println("getting brower launched");
		checkBrowserVersion();
		checkRAMSpace();
		OSCompatibility();
		updateBrowser();
		
	}
	
	//private layer
	private void checkBrowserVersion()
	{
		System.out.println("checkBrowserVersion");
	}
	
	private void checkRAMSpace()
	{
		System.out.println("checkRAMSpace");
	}
	
	private void OSCompatibility()
	{
		System.out.println("OSCompatibility");
	}
	
	private void updateBrowser()
	{
		System.out.println("updateBrowser");
	}
	
	
}
