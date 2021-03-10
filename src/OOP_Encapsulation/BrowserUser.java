package OOP_Encapsulation;

public class BrowserUser {

	public static void main(String[] args) 
	{
		Browser br = new Browser();
		br.launchBrowser();
		
		br.setVersion(72);
		int ver = br.getVersion();
		System.out.println(ver);

	}

}
