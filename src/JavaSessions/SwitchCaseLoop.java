package JavaSessions;

public class SwitchCaseLoop {

	public static void main(String[] args) 
	{
		//Solution to If else problem (Check IfElse Class)
		//Switch case with break loop
		
		String browser = "chrome";
		switch (browser) 
	 {
        case "chrome": 
    	           System.out.println("Launch chrome");
	               break;
			
        case "firefox":
                      	System.out.println("Launch firefox");
			              break;
			
        case "ie":
        	         System.out.println("Launch ie");
			          	break;
			    	 	
       case "opera":
    	             System.out.println("Launch opera");
    	              break;

		default:
			      System.out.println("Please pass the correct browser name"+browser);
			      break;
	
	}
		
		
//		int n = 0;
//		switch (n) 
//	{
//        case 5: 
//    	           System.out.println("Launch chrome");
//	               break;
//			
//        case 1:
//                      	System.out.println("Launch firefox");
//			              break;
//			
//        case 2:
//        	         System.out.println("Launch ie");
//			          	break;
//			    	 	
//       case 3:
//    	             System.out.println("Launch opera");
//    	              break;
//
//		default:
//			      System.out.println("Please pass the correct browser name "+n);
//			      break;
//	
//	}
		

	}

}
