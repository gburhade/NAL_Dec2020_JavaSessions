package JavaSessions;

public class DataConversions {

	public static void main(String[] args) 
	{
		//String to int
		String x = "100";
		System.out.println(x+20);//10020
		
		int i = Integer.parseInt(x);
		System.out.println(i+20); //120
		
		String total = "5000";
		int finalTotal = Integer.parseInt(total) + 10 -20 + 5;
		System.out.println(finalTotal);
		
		if(finalTotal==4995)
		{
			System.out.println("final total is correct");
		}
		
		
		String y ="100A";
		System.out.println(y+20); //100A20
		
	//	int j = Integer.parseInt(y);//ParseInt method would only accept pure number string to convert into int
	//	System.out.println(j); // Number Format Exception
		int val = Integer.parseInt(y.substring(0, 3));
		System.out.println(val + 20); //120
		
		
		//String to double
		
		String p ="12.33";
		System.out.println(p+300);
		
		
		double val1 = Double.parseDouble(p);
		System.out.println(val1+300);
		
		//int to String
		int marks = 100;
		String m = String.valueOf(marks);
		System.out.println(m+100);
		
		//double to String
		double d = 45.564;
		System.out.println(String.valueOf(d) + 45);
		
		//boolean to String
		boolean flag = true;
		System.out.println(flag + " Bye ");
		
		String f = String.valueOf(flag);
		System.out.println(f);
		
		
		
		
		
	}

}
