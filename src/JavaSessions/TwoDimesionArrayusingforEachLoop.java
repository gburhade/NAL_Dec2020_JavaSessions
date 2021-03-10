package JavaSessions;

public class TwoDimesionArrayusingforEachLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [][]myNum = new int[3][4];
		
		myNum[0][0] = 1;
		myNum[0][1] = 2;
		myNum[0][2] = 3;
		myNum[0][3] = 4;
		myNum[1][0] = 5;
		myNum[1][1] = 6;
		myNum[1][2] = 7;
		myNum[1][3] = 8;

		
		
		
		for(int e[] : myNum)
		{
			for(int p: e)
			{
				System.out.print(p+ " ");
			}
			System.out.println();
		}
	}

}
