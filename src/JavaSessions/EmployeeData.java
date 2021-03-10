package JavaSessions;

import java.util.ArrayList;

public class EmployeeData 
{
	
	public String getCompName()
	{
		return "IBM";
	}
	
	public int getEmpCount()
	{
		return 1000;
	}
	
	
	//returning array
   public Object[] getCompInfo()
   {
	   //return name and count 
	   System.out.println("get Company  Info");
	   Object compdata[] = new Object[2];
	   compdata[0] = "IBM";
	   compdata[1] = 1000;
	   return compdata;
	   
   }
	
   //returning arraylist
   public ArrayList<String> getEmpList()
   {
	   System.out.println("get Employee List");
	   ArrayList<String> empList = new ArrayList<String>();
	   empList.add("Sharayu");
	   empList.add("Priyanka");
	   empList.add("Ashiwini");
	   return empList;
   }
   
   
   
	
	
	public static void main(String[] args) 
	{
        EmployeeData obj = new EmployeeData();
        Object cominfo[] = obj.getCompInfo();
        for(Object e : cominfo)
        {
        	System.out.println(e);
        }
        
        ArrayList<String> eList = obj.getEmpList();
        System.out.println(eList);
        System.out.println(eList.size());
        
		
	}

}
