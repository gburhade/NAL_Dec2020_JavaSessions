package JavaSessions;

//Method Assignment 7

public class Results 
{
	
	public void displayGrades(int marks)
	{
		if(marks >= 91 && marks <=100)
		{
			System.out.println(marks + "  \tAA ");
		}
		else if(marks >= 81 && marks <=90)
		{
			System.out.println(marks +"  \tAB ");
		}
		else if(marks >= 71 && marks <=80)
		{
			System.out.println(marks +"  \tBB ");
		}
		else if(marks >= 61 && marks <=70)
		{
			System.out.println(marks +"  \tBC ");
		}
		else if(marks >= 51 && marks <=60)
		{
			System.out.println(marks +"  \tCD ");
		}
		else if(marks >= 41 && marks <=50)
		{
			System.out.println(marks +"  \tDD ");
		}
		else
		{
			System.out.println(marks +"  \tFail ");
		}
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Marks \t Grades");
		Results rs = new Results();
		rs.displayGrades(91);

	}

}
