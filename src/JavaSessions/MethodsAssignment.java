package JavaSessions;

import java.util.Scanner;

public class MethodsAssignment 
{
	
//	public int sum(int a, int b)
//	{
//		return a+b;
//	}
	
	public double product(double a, double b)
	{
		return a*b;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the values : ");
		Scanner sc = new Scanner(System.in);
		double input1 = sc.nextDouble();
		double input2 = sc.nextDouble();

		  MethodsAssignment m = new MethodsAssignment();
		  double res = m.product(input1, input2);
		  System.out.println("Product of two numbers are " + res);
//		  int tot = m.sum(80, 90);
//		  System.out.println("Sum of two value is "  + tot);
	}

}
