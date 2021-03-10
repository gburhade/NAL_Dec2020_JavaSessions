package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignment11 {

	public static void main(String[] args) 
	{

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		
		list.trimToSize(); //Using trimToSize() method we can trim the virtul cap to current size
		
		System.out.println(list);
	}

}
