package JavaSessions;

public class CompanyTest 
{

	public static void main(String[] args) 
	{
		Company c = new Company("Deloitte", 15000, "punit");
		
		System.out.println(c.name + " " + c.empcount + " " + c.ceoname);
		
		int ecount = c.getEmpCount();
		System.out.println("total employee count is " + ecount);
		
		String comname = c.getCompName();
		System.out.println(comname);
		
		Company comp = new Company("TCS", 12000, "TCS", "Mumbai", "Rajesh gopinathan");
		System.out.println(comp.name + " " + comp.hq + " " + comp.ceoname);
		
		String info = comp.getComInfo();
		System.out.println(info);

		
		
		
	}

}
