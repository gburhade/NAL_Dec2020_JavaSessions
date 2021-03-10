package JavaSessions;
//WAF - it will take parameter collegename as String and it will return static array


public class TeacherAssignment 
{

	public String[] getFacultyList(String collegeName)
	{
		System.out.println("college name is " + collegeName);
		String staffNames[] = new String[3];
		
		switch (collegeName) 
		{
		
		    case "IITD":
		    					staffNames[0] = "sultan";
		    					staffNames[1] = "yamini";
		    					staffNames[2] = "rashmi";
		    					break;
		    					
		    case "IIMB":
								staffNames[0] = "naveen";
								staffNames[1] = "hitesh";
								staffNames[2] = "vineet";
								break;
								
		    case "IITB":
								staffNames[0] = "akshara";
								staffNames[1] = "tejaswini";
								staffNames[2] = "deshmukh";
								break;

		   default:
			                System.out.println("College name not found...404 error");
			   				break;
		}
		
		return staffNames; //returning static array
	}
	
	public static void main(String[] args) 
	{

		   TeacherAssignment  ta = new TeacherAssignment();
		 String [] faclist =  ta.getFacultyList("IIMB"); 
		 //As getFacultyList method is returning Static Array, we need to iterate it using for loops or foreach loop
		 for(String e: faclist)
		 {
			 System.out.println(e);
		 }
	}

}
