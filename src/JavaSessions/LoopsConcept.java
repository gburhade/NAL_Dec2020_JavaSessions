package JavaSessions;

public class LoopsConcept
{

	public static void main(String[] args) 
	{
		//1.while loop
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println(i);
//			//i++; //post increment
//			i = i+1;
//		}
		
//		while(false)
//		{
//			System.out.println("DEad code/Unreachable code");
//		}

		
//		boolean flag = false;
//		while(flag)
//				{
//					System.out.println("code");
//				}

		//2.
//		int p=1;
//		while(p<=100)
//		{
//			System.out.println(p);
//			if(p%5==0)
//			{
//				System.out.println("Hi...");
//				if(p==10)
//				{
//		        break;// this break will terminate while loop 
//				}
//			}
//			p++;
//		
//		}
		
		
		//3.
		for(int m=1;m<=10;)
		{
			System.out.println(m);
			m++;
		}
		
		System.out.println("----------------------------------------------------------------");
		
		//4.
		for(int even=0;even<=10;even++)
		{
			System.out.println(even);
			even++;
		}
		
		System.out.println("----------------------------------------------------------------");
		
		for(int n=0;n<=100;n++)
		{
			System.out.println(n);
			
			if(n==0)
			{
				System.out.println("Zero...........Duck.....");
				break;
			}
			
			if(n==50)
			{
				System.out.println("Half Century........");
			}
			
			if(n==100)
			{
				System.out.println("Century.............");
			}
			
		}
		
		
		System.out.println("--------------------------------------------------");
		
		for(double d=1;d<=10;d++)
		{
			System.out.println(d);
		}
		
		
		System.out.println("--------------------------------------------------");
		
		//a to z
		for(char c='a';c<='z';c++)
		{
			System.out.println(c);
		}
		
		System.out.println("--------------------------------------------------");
		//do while loop
		int r=1;
		do {
			System.out.println("r = "+r);
			r++;
		}while(false);
		
		
		
	}

}
