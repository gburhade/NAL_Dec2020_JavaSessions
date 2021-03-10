package OOP_AbstractClass;

public class HomePage extends Page 
{

	@Override
	public void title() {
     System.out.println(" home page title");		
	}

	@Override
	public void header() {
      System.out.println(" home page header ");		
	}

	@Override
	public void URL() {
      System.out.println(" https://www.xyz.com/homepage.jsp ");		
	}

}
