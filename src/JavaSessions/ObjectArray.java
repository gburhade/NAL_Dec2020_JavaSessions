package JavaSessions;

public class ObjectArray {

	public static void main(String[] args) 
	{
		//To Store Different type of data into one array we used Object class
		
		Object emp[] = new Object[5];
		emp[0] = "Gaurav";
		emp[1] = 50;
		emp[2] = 75.46;
		emp[3] = 'R';
		emp[4] = true;
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
		System.out.println("----------------------------------------");
		
		//for each loop
		for(Object e: emp)
		{
			System.out.println(e);
		}

	}

}
