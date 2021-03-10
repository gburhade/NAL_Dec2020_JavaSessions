package JavaSessions;

import java.util.Scanner;

public class Election 
{
	public void checkForEligibility(int age)
	{
		
		if(age>=18)
		{
			System.out.println("Candidate is Eligible");
		}
		else
		{
			System.out.println("Candidate below 18 are not Eligible");

		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the Candidates Age : ");
		Scanner sc = new Scanner(System.in);
		int cage = sc.nextInt();

		Election e = new Election();
		e.checkForEligibility(cage);
	}

}
