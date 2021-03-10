package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();   // Not REcommended to declare ArrayList without generics

       System.out.println(ar.size());
       
       ar.add(10);//1 - 0th segment
       ar.add(20);//2
       
       System.out.println(ar.size()); //Physical Capacity = 2 and Virtul Capacity = 8
       //Physical Capacity is equal to size of an ArrayList
       
       ar.add(30);//3
       ar.add(40);//4
       
       System.out.println(ar.size()); //Physical capacity = 4 and Virtual Capacity = 6
       
       
       ar.add(50);//5
       ar.add(60);//6
       ar.add(70);//7
       ar.add(80);//8
       ar.add(90);//9
       ar.add(100);//10 - 9th segment
       
       System.out.println(ar.size()); //Physical capacity
       ar.add(100);//11   -  10th segment
       
       
       ar.add("gaurav");//12 
       ar.add(12.45);//13
       ar.add('P');//14
       ar.add(true);//15     -  14th segment
       System.out.println(ar.size());
       
       ar.add(150); //16   -  15th segment
       ar.add(150);//17
       ar.add(150);//18
       ar.add(150);//19
       ar.add(150);//20
       ar.add(150);//21
       ar.add(150);//22   -  21st segment
       ar.add(150);//23    -  22nd segment
       
       System.out.println(ar);
       
       
       //ArrayList with Generics
       
       //1.int arraylist
       ArrayList<Integer> marks = new ArrayList<Integer>();
       marks.add(100);
       marks.add(200);
     //  marks.add(12.45); // compilation error - The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (double)
     //  marks.add("gaurav"); //compilation error - The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
     //  marks.add('C'); //compilation error - The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (char)
       System.out.println(marks);
       
       
       //2.String ArrayList
       ArrayList<String> nameslist = new ArrayList<String>();
       nameslist.add("Rajesh");
       nameslist.add("Gaurav");
       nameslist.add("Saraswati");
       nameslist.add("Tushar");
       nameslist.add("Sachin");
       
       //nameslist.add(123)
       System.out.println(nameslist);
       
       //3.Float arraylist
       ArrayList<Float> price = new ArrayList<Float>();
       price.add(35.00f);
       price.add(65.50f);
       //price.add(true);
       System.out.println(price);
       
       
       
       //Imp : When we want to add different type of data in ArrayList then we need to Use Object type of Class in ArrayList
       
       //Emp list with different types of data
       
       ArrayList<Object> empData = new ArrayList<Object>();
       empData.add("Lionel");
       empData.add(33);
       empData.add('M');
       empData.add("Barcelona");
       empData.add(true);
       
       System.out.println(empData);
       
       //for each loop for Object Class
       System.out.println("Emp Data");
       for(Object e: empData)
       {
    	   System.out.println(e);
       }
       
       
       
       

	}

}
