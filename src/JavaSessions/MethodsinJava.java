package JavaSessions;

public class MethodsinJava 
{
	//Methods type
	//1.no input no return type
	
	public  void test()
	{
		System.out.println("test Method");
	}

	public void addMarks()
	{
		System.out.println("add Marks");
		int a=20;
		int b=30;
		int c = 40;
	   int d = a + b + c;
	   System.out.println(d);
	}
	
	
	//2. no input but return some
	public int getScore()
	{
		System.out.println("get Score");
		int score = 100;
		int bal = 20;
        int finalScore = score + bal;
        return finalScore;
	}
	
	public String getTrainerName()
	{
		System.out.println("get Trainer Name");
		String name = "Naveen";
		return name;
		
	}
	
	
	//3.some input and some return
	public int add(int a, int b)
	{
		System.out.println("add method");
		int sum = a + b;
		return sum;
	}
	
	public double getSalary(double prevCTC)
	{
		System.out.println("get Salary");
		double inhandsal = 100000.45;
		double covidrefamnt = 3656.45;
		double totCTC =  prevCTC + inhandsal + covidrefamnt;
		return totCTC;
	}
	
	
	
	
	public static void main(String[] args) 
	{

		System.out.println("Main Method...");
		//As test method is non static, we need to Create a object to call test method
		MethodsinJava obj  =  new MethodsinJava();
		obj.test();
		obj.addMarks();
		int sc = obj.getScore(); // sc is a holding parameter
	   System.out.println(sc-10);
	   String tname = obj.getTrainerName(); // tname is a holding parameter
	   System.out.println(tname);
	   int s = obj.add(101, 201);
	   System.out.println(s);
	   
	   
	   double currCTC = obj.getSalary(15000.56);
	   System.out.println(currCTC);
		
	}

}
