package JavaSessions;

public class ArrayConcepts {

	public static void main(String[] args) 
	{
		//A.one way of declaring array
		//1.int array
		int i[] = new int[4];
		//i[-1] = 5;
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]); //10
		System.out.println(i[3]); //40
		//System.out.println(i[4]); //0
		//System.out.println(i[-1]); //java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println("----------------------------------------------------");
		for(int k=0;k<i.length;k++)
		{
			System.out.println(i[k]);
		}
		
		System.out.println("---------------------------------------");
		
		
		//2.Double Array
		double d[] = new double[5];
		d[0] = 15.66;
		d[1] = 5.47;
		d[2] = 65.12;
		
		System.out.println(d.length);
		System.out.println(d[1]);
		System.out.println(d[3]);
		System.out.println("-------------");
		System.out.println(d);  // values of array will not be printed using syso , it will print address of that array variable where those values are stored
		System.out.println("-------------");
		for(int k=0;k<d.length;k++)
		{
			System.out.println(d[k]);
		}
		
		System.out.println("----------------------------------------");
		
		//3.char array
		char c[] = new char[2];
		c[0] = 'a';
		c[1] = '&';
		//c[2] = '9';
		
		System.out.println(c.length);
		System.out.println(c[1]);
		
		for(int i1=0;i1<c.length;i1++)
		{
			System.out.println(c[i1]);
		}
		
		//4.String Array
		String st[] = new String[5];
		st[0] = "gaurav";
		st[0] = "shekhar";
		st[0] = "sachin";
		st[0] = "pradeep";
		
		System.out.println(st[0]);
		
		//B.Array Literal - another way of declaring array when we are aware of no of elements in array
		int val[] = {1,6,4,89,54,23,10,6946,16,3,4,5,6};
		
		System.out.println(val.length);
        System.out.println("Highest index : "+(val.length-1));
        System.out.println("Lowest index : "+0);
        
        for(int e: val)
        {
        	System.out.println(e);
        }
        
        
        
		
		
	}

}
