package OOP_Interface;

public class FortisHospital  extends CentralHospital implements USMedical, IndianMedical, UKMedical 
{

	// US Medical
	
	@Override
	public void cardicServices() 
	{
	
		System.out.println("FH - cardicServices");
	}

	@Override
	public void orthoServices() 
	{
	  System.out.println("FH - orthoServices");	
	}

	@Override
	public void pediaServies() 
	{
	  System.out.println("FH - pediaServices");	
	}

	//Indian Medical
	
	@Override
	public void oncologyServices() 
	{
	  System.out.println(" FH - oncologyServices");	
	}

	@Override
	public void OPDService() 
	{
	  System.out.println("FH - OPDServices");	
	}

	@Override
	public String hospInfo() 
	{
		System.out.println(" FH - Hospital Info");
		return "fhinfo";
	}


	@Override
	public void opthoServices() {
		// TODO Auto-generated method stub
		
	}
	
	// UK Medical
	
	@Override
	public void neuroServies() 
	{
		System.out.println(" FH - neuroServices");
		
	}

	@Override
	public void entServices() {
		System.out.println(" FH - entServices");
		
	}

	@Override
	public void orthaepedicsHospital() {
		System.out.println(" FH - orthaepedicsHospital");
		
	}


	//Non Overridden Methods
	
	public void medicalInsurance()
	{
		System.out.println("FH - Medical Insurance");
	}
	
	public void medicalTraining()
	{
		System.out.println(" FH - Medical Training");
	}

	
	//central hospital
	@Override
	public void hospitalInfra()
	{
		System.out.println(" Centrl Hospital - hospitalInfra");
	}

	
	//WHO
	@Override
	public void covid19Test() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void billing()
	{
		System.out.println("FH - billing");
	}

	
	@Override
	public void healthFund() {
		// TODO Auto-generated method stub
		
	}
	
}
