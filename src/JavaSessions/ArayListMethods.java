package JavaSessions;

import java.util.ArrayList;

public class ArayListMethods {

	public static void main(String[] args) 
	{
		ArrayList<String> lang = new ArrayList<String>();
		
		lang.add("JAVA");//0
		lang.add("JAVASCRIPT");//1
		lang.add("PYTHON");//2
		lang.add("C#");//3
		
		System.out.println(lang);
		
		lang.set(3, "PHP");
		
		System.out.println(lang);
		
		lang.add(null);
		System.out.println(lang);
		
		lang.add(null);
		lang.add(null);
		
		System.out.println(lang);
		System.out.println(lang.size());
		
		lang.remove(3);
		System.out.println(lang);
		System.out.println(lang.get(3));
		System.out.println(lang.size()); // ArrayList size shrink after removing the 3rd index element
	//Initially it was 7 and after removing 3rd index value, now its 6	
	
	//	System.out.println(lang.get(6)); // Index outofBoundException
	}

}
