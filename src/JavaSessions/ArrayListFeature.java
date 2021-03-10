package JavaSessions;

import java.util.ArrayList;

public class ArrayListFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> marks = new ArrayList<Integer>();
	       marks.add(100);//0
	       marks.add(200);//1
	       marks.add(300); //2
	       marks.add(400); //3
	       
	       //Physical Capacity = 4 , Virtul Capacity = 6
	       
	       System.out.println(marks.get(1)); // 200
	       System.out.println(marks.get(3)); // 400
	 //      System.out.println(marks.get(4)); //IndexOutOfBoundsException:
	   //    System.out.println(marks.get(5)); //IndexOutOfBoundsException
	       
	       marks.add(4, 400);
	       marks.add(5, 500);
	       
	       System.out.println(marks.get(4));
	       System.out.println(marks.get(5));
	       
	       System.out.println(marks);
	       
	       // To Print all the data present in arraylist
	       System.out.println("For Loop");
	       
	       for(int i=0;i<marks.size();i++)
	       {
	    	   System.out.println(marks.get(i));
	       }
	       
	       
	       //for each loop tp print data from arraylist
	       
	       System.out.println("For Each Loop");
	       
	       for(Integer e: marks)
	       {
	    	   System.out.println(e);
	       }
	       
 
	}

}
