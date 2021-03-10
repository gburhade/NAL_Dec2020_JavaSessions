package JavaSessions;

//method assignment 4

public class FindingMaxMin 
{
	
	public void Maximum(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println( a+ " is the Maximum Number");
		}
		else if(b>c)
		{
			System.out.println( b+ " is the Maximum Number");
		}
		else
		{
			System.out.println( c+ " is the Maximum Number");
		}
		
	}
	
	public void Minimum(int x, int y, int z)
	{
		if(x<y && x<z)
		{
			System.out.println( x + " is the Minimum Number");
		}
		else if(y<z)
		{
			System.out.println( y + " is the Minimum Number");
		}
		else
			System.out.println( z + " is the Minimum Number");
		
	}
	
	

	public static void main(String[] args) 
	{

		   FindingMaxMin fm = new FindingMaxMin();
		   fm.Maximum(5,85,120);
		   fm.Minimum(-1,0, 165);
	}

}
