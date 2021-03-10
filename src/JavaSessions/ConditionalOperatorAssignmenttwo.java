package JavaSessions;

import java.util.Scanner;

public class ConditionalOperatorAssignmenttwo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num1 = sc.nextInt();
	
		if(num1>0)
		{
			System.out.println(num1+" is a positive integer");
		}
		else if(num1<0)
		{
			System.out.println(num1+" is negative integer");
		}
		else
			System.out.println(num1+" is 0. Please enter value greater than or less than 0");

	}

}
