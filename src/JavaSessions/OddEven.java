package JavaSessions;

import java.util.Scanner;

//MethodAssignment5


public class OddEven 
{
	public void checkForOddEven(int number)
	{
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else
			System.out.println("Odd Number");
		
	}

	public static void main(String[] args) 
	{

		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		OddEven o = new OddEven();
		o.checkForOddEven(num);
		
	}

}
