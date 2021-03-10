package JavaSessions;

public class Company 
{
	String name;
	int empcount;
	String logo;
	String hq;
	String ceoname;
	
	//Constructors parametrized
	
	public Company(String name, int empcount, String logo, String ceoname) 
	{
		this.name = name;
		this.empcount = empcount;
		this.logo = logo;
		this.ceoname = ceoname;
	}

	public Company(String name, int empcount, String ceoname) 
	{
		this.name = name;
		this.empcount = empcount;
		this.ceoname = ceoname;
	}

	public Company(String name, int empcount, String logo, String hq, String ceoname) 
	{
		this.name = name;
		this.empcount = empcount;
		this.logo = logo;
		this.hq = hq;
		this.ceoname = ceoname;
	}
	
	
	// Methods
	
	public String getCompName()
	{
		return name;
	}
	
	
	public int getEmpCount()
	{
		return empcount;
	}
	
public String  getComInfo()
{
	return "some comp info";
			
}
	

}
