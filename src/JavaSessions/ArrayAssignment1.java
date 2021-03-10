package JavaSessions;

public class ArrayAssignment1 {

	public static void main(String[] args) 
	{
 
		Object [] player1 = new Object[6];
		player1[0] = "Virat Kohli";
		player1[1] = 32;
		player1[2] = "India";
		player1[3] = "23-Sep-1989";
		player1[4] = 'M';
		player1[5] = 59.65;
		
		Object[] player2 = new Object[6];
		player2[0] = "Elyse Perry";
		player2[1] = 31;
		player2[2] = "Australia";
		player2[3] = "14-Mar-1990";
		player2[4] = 'F';
		player2[5] = 34.56;
		
		Object[] player3 = new Object[6];
		player3[0] = "Kane Williamson";
		player3[1] = 33;
		player3[2] = "New Zealand";
		player3[3] = "14-Mar-1986";
		player3[4] = 'M';
		player3[5] = 30.56;
		
		Object[] player4 = new Object[6];
		player4[0] = "AB Devilliers";
		player4[1] = 35;
		player4[2] = "South Africa";
		player4[3] = "14-Mar-1987";
		player4[4] = 'M';
		player4[5] = 32.56;
		
		System.out.println("Name \t \tAge\tTeamName\tDateOfBirth\tGender\tStrikeRate");
		
		for(Object e: player1)
		{
			System.out.print(e+"\t");
		}
		System.out.println();
		
		for(Object e: player2)
		{
			System.out.print(e+" \t");
		}
		System.out.println();
		
		for(Object e: player3)
		{
			System.out.print(e+"\t");
		}
		System.out.println();
		
		for(Object e: player4)
		{
			System.out.print(e+"\t");
		}
		System.out.println();
	}

}
