package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment9 
{

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
       
      Collections.swap(al, 2, 3);
      Collections.swap(al, 0, 7);
      System.out.println("After Swapping the Elements :");
      System.out.println(al);
     
      //  al.clear();
       al.removeAll(al);
       System.out.println("After Removing all elements in arraylist : "+al);
       
       

	}
	
	
	

}
