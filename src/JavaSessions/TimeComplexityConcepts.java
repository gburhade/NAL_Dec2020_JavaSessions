package JavaSessions;

public class TimeComplexityConcepts 
{

	public static void main(String[] args) 
	{
		//Time Complexity
		//Big O
		//n, n^2, n^3
		
		int i = 10;
		System.out.println(i);
		//O(1)   -  Time Complexity
		
		for(int j=1;j<=100;j++)
		{
			System.out.println(j);
		}
		
		// 1 + n + n + n ==> 1 + 3n => 3n + 1	=> 3n ==> n ==> O(n)
		//Above equation is also called as Linear Equation
		
		
		for(int m=1; m<=9; m++)
		{
			for(int n=1;n<=9;n++)
			{
				System.out.print(m+" "+n);
			}
			System.out.println();
		}
		
		// (1+ n + n +n)  (1+ n + n + n) 
		// (1+3n) (1+3n)
		//1 + 3n + 3n + 9n^2
		// 1 + 6n + 9n^2  -  ignoring the constant 1  (Quadratic Equation)
		// 6n + 9n^2 = > 9n^2 + 6n
		// 3(3n^2 + 2n) - ignoring the constant 3
		//3n^2 + 2n -  ignoring the constant 3 & 2
		// n^2 + n
		//n(n +1)  
		// n(n) = > n^2 => O(n^2)  
		
		System.out.println("------------------");
		for(int m=1; m<=9; m++)
		{
			for(int n=1;n<=9;n++)
			{
				for(int k=1;k<=9;k++)
				{
					System.out.print(m+" "+n+" "+k);				
					}
			}
			System.out.println();
		}
		
		//Time Complexity -> (1+ n) (1+n) (1 + n)  =(After Simplification supp.) > 1 + n^3 = > n^3 => O(n^3) - Time complexity for 3 'for loops'
		
	}

}
