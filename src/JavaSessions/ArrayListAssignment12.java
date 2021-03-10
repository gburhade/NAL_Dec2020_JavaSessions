package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignment12 
{

	public static void main(String[] args) 
	{

		ArrayList<Float> price = new ArrayList<Float>();
		price.add(13.40f);
		price.add(70.57f);
		price.add(35.47f);
		price.add(30.50f);
		price.add(77.46f);
		price.add(80.00f);
		price.add(74.50f);
		
		for(int i=0;i<price.size();i++)
		{
			System.out.println(price.get(i));
		}
			
	}

}
