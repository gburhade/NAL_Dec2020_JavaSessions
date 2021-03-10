package StringManipulations;

public class StringManipulationsConcept {

	public static void main(String[] args) 
	{
		
		String str = "Hello Gaurav This is my java code and i am enjoying it";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41)); //StringIndexOutOfBoundsException
		//System.out.println(str.charAt(-1)); //StringIndexOutOfBoundsException
		
		//'index of' function will return index of particular character 
		System.out.println(str.indexOf('m'));  
		System.out.println(str.indexOf('i')); //1st occurence of i
		
		
		//Interview question to find second occurence of i
		System.out.println(str.indexOf('i', 3)); //hard coded value
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
		System.out.println(str.indexOf("java"));//24
		
		System.out.println(str.indexOf("am"));//40
		
		System.out.println(str.indexOf("naveen")); //-1
		
		String msg = "Welcome Gaurav";
		if(msg.indexOf("Gaurav")>0)
		{
			System.out.println(" Usernme gaurav is there in message");
		}
		else
		{
			System.out.println(" User Name is missing");
		}
		
		if(msg.indexOf("Gaurav") == 8)
		{
			System.out.println("User Name is found");
		}
		else
		{
			System.out.println(" User name is missing");

		}
		
		if(msg.indexOf("Gaurav") == -1)
		{
			System.out.println(" User name is missing");
		}
		else
		{
			System.out.println("User Name is found");
		}
		
		
		String st = "welcome to testing";
	    System.out.println(st.toUpperCase());
	    System.out.println(st.toLowerCase());
	    
	    
	    //trim() - for removing the spaces from the corner
	    String st2 = "    hello   world   ";
	    System.out.println(st2.trim());
	    
	    //real time user - when passing browser - chrome
	    String browser = "chrome ";
	    if(browser.trim().equals("chrome"))
	    {
	    	System.out.println("Launch Browser");
	    }
	    
	    //contains:
	    String s = "your app name is amazon";
	    if(s.contains("amazon"))
	    {
	    	System.out.println("correct message name");
	    }
	    else
	    {
	    	System.out.println(" incorrect message name ");
	    }
		
	    String url = "http://www.xyz.com/loginpage.jsp";
	    
	    if(url.contains("loginpage"))
	    {
	    	System.out.println("login page url is correct");
	    }
	    
	    
	    //equals
	    String s11 = "testing selenium";
	    String s12 = "testing Selenium ";
	    
	    System.out.println(s11.equalsIgnoreCase(s12.trim()));
		
	    //substring
	    String sent = "this is my java code";
	    System.out.println(sent.substring(11));
	    System.out.println(sent.substring(5, 9));//5,8 will ignore the last index
		

        String stt = "your transaction id is 12345";
		
		System.out.println(stt.substring(stt.indexOf("is")+3,stt.length()));
		System.out.println(stt.substring(stt.indexOf("is")+3));
		
		//Replace
		
		String dob = "01-09-1970";
		System.out.println(dob.replace('-', '/'));
		
		//split
		String lang = "JAVA;PYTHON;RUBY;JAVASCRIPT;GOLANG";
		String langArr[] = lang.split(";");
        System.out.println(langArr[0]);	
        System.out.println(langArr[1]);
        System.out.println(langArr.length);
        
        for(String e : langArr)
        {
        	System.out.println(e);
        }
		
		//real time example of split in data driven
        //to fill registration form
        String testdata = "mohit;bisht;mohitb@gmail.com;9877898;test@123";
        
        String testdataArr[] = testdata.split(";");
        
        for(int i=0;i<testdataArr.length;i++)
        {
        	 System.out.println(testdataArr[i]);
        	 //pass the value to textfield - data[i]
        }
		
        //InterviewQuestions
        String str3 = "xXIndiaXxXXRussiaxXXUKXxXXSingapore";
        
        String []strArr = str3.split("xX");
        System.out.println(strArr[0]);// at 0th index u will get nothing - imp
        System.out.println(strArr[1]);// IndiaX
        System.out.println(strArr[2]);// XRussia
        System.out.println(strArr[3]);   // XUKX     
        System.out.println(strArr[4]);// XSingapore
		
		
		
		
	}

}
