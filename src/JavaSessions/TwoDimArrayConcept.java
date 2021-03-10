package JavaSessions;

public class TwoDimArrayConcept {

	public static void main(String[] args)
	{

		//array Literal 
     int myNum[][] = {
    		 
    		            {1, 2, 3, 4},
    		            {10, 20, 30, 40, 50},
    		            {100, 200, 300, 400, 500, 600},
    		            {1000, 2000, 3000, 4000, 5000, 6000, 7000},
    		            {4,5,6}
    		            
                     };
     
     
     for(int i=0;i<myNum.length;i++)
     {
    	 for(int j=0; j<myNum[i].length;j++)
    	 {
    		 System.out.print(myNum[i][j] + " ");
    	 }
    	 System.out.println();
     }
	
     //normal array definition
     int data[][] = new int[3][5];
     data[0][0] = 10;
     data [0][1] = 20;
   //  data[3][5] = 50;
     
     
     System.out.println(data[0][0]);
     System.out.println(data[0][1]);
  //   System.out.println(data[3][5]);
     
     
     
     
     //printing 2 dimesion array using for each loop
	}

}
