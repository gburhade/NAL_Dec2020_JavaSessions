package JavaSessions;

import java.util.Scanner;

public class ConditionalOperatorAssignment1 {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		float a = sc.nextFloat();
		System.out.println("Enter the second number");
		float b = sc.nextFloat();
		System.out.println("Enter the third number");
		float c = sc.nextFloat();
		System.out.println("Enter the fourth number");
		float d = sc.nextFloat();
		
		
		if(a>b && a>c && a>d)
		{
			System.out.println(a+" is highest number");
		}
		else if (b>c && b>d)
		{
			System.out.println(b+" is highest number");
		}
		else if(c>d)
		{
			System.out.println(c+" is highest number");
		}
		else
			System.out.println(d+" is highest number");

	}

}
