package JavaSessions;

import java.util.ArrayList;

//WAF - it will take collegeName(String) and it will return facultyList (ArrayList<String>)


public class Teacher 
{
	
	public ArrayList<String> getFacultyList(String collegeName)
	{
		System.out.println("college name is " + collegeName);
		ArrayList<String> facultyList = new ArrayList<String>();
		
		switch (collegeName) 
		{
		      case "IITP":
			                       facultyList.add("Rakesh");
			                       facultyList.add("Ketan");
			                       facultyList.add("Shekhar");
			                          break;
			                          
		      case "IIMB":
		    	  					facultyList.add("Akshara");
		    	  					facultyList.add("Tejasvini");
		    	  					facultyList.add("Charlies");
		    	  					break;
		    	  					
		      case "IITK":
		    	  					facultyList.add("Steve");
		    	  					facultyList.add("charlotte");
		    	  					facultyList.add("raj");
		    	  					break;

		          default:
			   						System.out.println("College Name not found...");
		                  			break; 
		     }
		
		  return facultyList;
		
	
	}
	
	
	
	


	public static void main(String[] args) 
	{
		  Teacher t = new Teacher();
		  ArrayList<String> faclist = t.getFacultyList("COEP");
		  System.out.println(faclist);
		
		
	}

}
