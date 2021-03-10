package JavaSessions;

public class CarDesign 
{
	String name;
	int price;
	String color;
	static final int wheels = 4; // part of CMA/Metaspace/Permanent generation

	public static void main(String[] args) 
	{

		final int i =30;
		System.out.println(i);
		
      CarDesign c1 = new CarDesign();
      c1.name = "BMW";
      c1.price = 60;
      c1.color = "Black";
      
      CarDesign c2 = new CarDesign();
      c2.name = "Audi";
      c2.price = 70;
      c2.color = "Red";
      
      CarDesign c3 = new CarDesign();
      c3.name = "Honda";
      c3.price = 20;
      c3.color = "White";
      
      System.out.println(c2.name + " " + c2.price + " " + c2.color + " " + CarDesign.wheels);
		
	}

}
