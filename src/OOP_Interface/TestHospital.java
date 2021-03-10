package OOP_Interface;

public class TestHospital 
{

	public static void main(String[] args) 
	{
		FortisHospital fh = new FortisHospital();
		fh.cardicServices();
		fh.entServices();
		String info = fh.hospInfo();
		System.out.println(info);
		fh.neuroServies();
		fh.medicalInsurance();
		fh.medicalTraining();
		
		//USMedical.min_fee = 30;
		System.out.println(USMedical.min_fee);
		USMedical.bloodTest();
		
		fh.billing();
		
		
		//Top Casting
		//Child class object can be referred by Parent interface reference variables
		USMedical us = new FortisHospital();
		us.pediaServies();
		
		
		UKMedical uk = new FortisHospital();
		uk.orthaepedicsHospital();
		
		IndianMedical in = new FortisHospital();
		in.oncologyServices();
		
		
		
	
		
	}

}
