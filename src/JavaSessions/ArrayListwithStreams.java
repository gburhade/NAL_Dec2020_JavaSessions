package JavaSessions;

import java.util.ArrayList;

public class ArrayListwithStreams {

	public static void main(String[] args) 
	{

		ArrayList<String> lang = new ArrayList<String>();
		lang.add("Python");
		lang.add("Java");
		lang.add("C#");
		lang.add("Javascript");
		
		//From JDK 8, Streams were introduced
		//Functional Pogramming
		
		long sttime = System.currentTimeMillis();
		
		lang.stream().forEach(e -> System.out.println(e)); //-> stands for Lambda
		
		long endtime = System.currentTimeMillis();
		
		System.out.println(endtime - sttime);
		
		System.out.println("------------------");
		
		//Parallel stream
		
		long sttime1 = System.currentTimeMillis();
		
		lang.parallelStream().forEach(e -> System.out.println(e));
		
		long endtime1 = System.currentTimeMillis();
		
		System.out.println(endtime1 - sttime1);
		
		
	}

}
