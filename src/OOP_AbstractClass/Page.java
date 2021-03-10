package OOP_AbstractClass;

//abstract class
public abstract class Page 
{
	
	//We can create abstract class constructor
	//however it will be called when we create child class object
	
	//constructor
	public Page()
	{
		System.out.println(" Page Class Constructor");
	}

	//abstract methods
	public abstract void title();
	public abstract void header();
	public abstract void URL();
	
	
	//logo() method has been declared final so logo method won't be overriden ever in child class 
	public final static void logo()
	{
		System.out.println(" App --- Logo ");
	}
	
	
	public void loadingTimeout()
	{
		System.out.println(" Loading Time is 20 secs...." );
	}

}
