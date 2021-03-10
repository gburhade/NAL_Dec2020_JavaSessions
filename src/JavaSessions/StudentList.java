package JavaSessions;
//WAF to pass the student name(string) and it will return student marks (int)


public class StudentList 
{
	
	//Approach 1
	public int getStudentMarks(String studentName)
	{
		System.out.println("Student Name is " + studentName);
		
		if(studentName.equals("pawan"))
		{
			return 90;
		}
		else if(studentName.equals("zuber"))
		{
			return 95;
		}
		else if(studentName.equals("rashmi"))
		{
			return 50;
		}
		else
		{
			System.out.println("Student name " + studentName + " not found.....404 error");
			return -1;
		}
		
	}
	
	
	//Approach 2
	public int getStMarks(String studentName)
	{
         System.out.println("Student Name is " + studentName);
		int marks = -1;
		
		if(studentName.equals("pawan"))
		{
			marks = 90;
		}
		else if(studentName.equals("zuber"))
		{
			marks = 95;
		}
		else if(studentName.equals("rashmi"))
		{
			marks = 50;
		}
		else
		{
			System.out.println("Student name " + studentName + " not found.....404 error");
		}
		
		return marks;
		
	}
	

	public static void main(String[] args) 
	{
          StudentList s = new StudentList();
          int mark1 = s.getStudentMarks("tom");
         System.out.println(mark1);
//         
//         int mark2 = s.getStudentMarks("gaurav");
//         System.out.println(mark2);
          
//          int mark2 = s.getStMarks("pawan");
//          System.out.println(mark2);
//          
//          int mark3 = s.getStMarks("Philippe");
//          System.out.println(mark3);
//          
          
          
	}

}
