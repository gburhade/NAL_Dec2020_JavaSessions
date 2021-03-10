package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignment7 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('G');//0
		al.add('H');//1
		al.add('I');//2
		al.add('J');//3
		al.add('K');//4
		al.add('L');//5
		al.add('Z');//6
		
		ArrayList<Character> revlist = new ArrayList<Character>();
		
		System.out.println(al);
		
		int len = al.size();
		for(int i=len-1;i>=0;i--)
		{
			revlist.add(al.get(i));	
		}

		//System.out.println("After Reversing elements in ArrayList : "+revlist);
		
		
		//Java program to extract a portion of a array list
		System.out.println("Portion of array List : "+al.subList(3, 6));  // using sublist method
		System.out.println("Portion of arraylist : "+al.subList(0, 3)); //using sublist method
		
		
	}

}
