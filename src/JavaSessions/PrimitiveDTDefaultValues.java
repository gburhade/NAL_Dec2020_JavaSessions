package JavaSessions;

public class PrimitiveDTDefaultValues 
{

	public static void main(String[] args) 
	{
		//1.byte
		byte b[] = new byte[10];
		b[0] = 10;
		b[1] = 20;
		System.out.println(b[0]); //10
		System.out.println(b[1]); //20
		System.out.println(b[2]); //0 Default value of Byte Datatype is 0
		
		//2.short
		short s[] = new short[10];
		s[0] = 10;
		s[1] = 20;
		System.out.println(s[1]); //20
		System.out.println(s[5]); // 0 Default value of Short Datatype is 0
		
		//3.int
		int i[] = new int[10];
		i[0] = 10;
		i[1] = 20;
		System.out.println(i[0]); //10
		System.out.println(i[8]); //0 Default value of Int Datatype is 0
		
		//4.long
		long l[] = new long[10];
		l[0] = 40;
		l[1] = 50;
		System.out.println(l[0]);//40
		System.out.println(l[1]);//50
		System.out.println(l[5]); // Default value of long datattype is 0
		
		//5.float
		float f[] = new float[10];
		f[0] = 10.16f;
		f[1] = 74.16f;

		System.out.println(f[0]); //10.16
		System.out.println(f[1]); //74.16
		System.out.println(f[6]); //0.0 DEfault value of float datatypes is 0.0

		//6.doublr
		double d[] = new double[10];
		d[0] = 10.16;
		d[1] = 74.16;

		System.out.println(d[0]); //10.16
		System.out.println(d[1]); //74.16
		System.out.println(d[6]); //0.0 DEfault value of float datatypes is 0.0
		
		//7.String
		String st[] = new String[10];
		st[0] = "gaurav";
		st[1] = "burhade";
		System.out.println(st[1]); //burhade
		System.out.println(st[5]); // DEfault value of Strig datatype is null
		
		//8.boolean
		boolean bo[] = new boolean[10];
		bo[0] = true;
		bo[1] = false;
		
		System.out.println(bo[0]); //true
		System.out.println(bo[7]); //DEfault value of boolean datatype is false
		
		
		
		

	}

}
