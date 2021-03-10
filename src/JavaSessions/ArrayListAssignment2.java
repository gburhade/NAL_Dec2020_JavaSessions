// Java program to insert an element into the array list at the first and last positions
 // Java program to retrieve an element (at a specified index) from a given array list.

package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignment2 {

	public static void main(String[] args) 
	{
    
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);//0
		al.add(10);//1
		al.add(206);//2
		al.add(450);//3
		al.add(9);//4
		al.add(81);//5
		al.add(70);//6
		al.add(13);//7
		
		
		System.out.println(al);
		
		al.set(0,100);
		al.set(7, 700);
		
		System.out.println(al);
		
		System.out.println("----------------------------------");
		System.out.println(al.get(1));
		System.out.println(al.get(5));
		System.out.println(al.get(7));
		
		//Java program to remove the third element from a array list. 
		al.remove(2);  // 3rd element from arraylist
		System.out.println(al);
		
		
	}

}
