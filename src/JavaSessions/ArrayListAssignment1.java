//Java program to create a new array list, add some colors (string) and print out the collection

package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignment1 {

	public static void main(String[] args) 
	{
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("#FF0000");
		colours.add("#FFD700");
		colours.add("#008000");
		colours.add("#00FFFF");
		colours.add("#0000FF");
		colours.add("#FF1493");
		colours.add("#A52A2A");
		colours.add("#FFFFFF");
		
		//for each loop
		for(String s : colours)
		{
			System.out.println(s);
		}
		

	}

}
