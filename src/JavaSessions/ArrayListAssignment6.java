//Java program to search an element in a array list.
package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignment6 
{

	public static void main(String[] args) 
	{

		ArrayList<String> al = new ArrayList<String>();
		al.add("Selenium");
		al.add("QTP");
		al.add("Appium");
		al.add("Test Complete");
		al.add("Cucumber");
		al.add("WebDriverIO");
		al.add("Protractor");
		
		System.out.println(al);
		
		System.out.println("---------------------------");
		for(int i=0;i<al.size();i++)
		{
			String s =al.get(i);
			if(s.equals("Protractor"))
			{
				System.out.println(s+" is present at index "+i+ " in ArrayList");
			}
		}
		
		
	}

}
