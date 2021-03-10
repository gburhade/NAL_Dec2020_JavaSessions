package JavaSessions;

/**
 * 
 * @author PERENNIAL-QA
 *
 */

public class DataTypes {

	public static void main(String[] args) 
	{
		
		
		//1.Byte (-128 to 127   -  1 byte)
		byte b1 = -128;
		b1 = -127;
		System.out.println("byte value is : "+b1);
		
		//2.short (-32768 to 32767  -  2 bytes)
		short s = 32767;
		System.out.println("short value is : "+s);
		
		//3.int (-2147483648 - 2147483647   -  4 bytes)
        int i = 2147483647;
        System.out.println("Integer Value is : "+i);
        
        //4.long - 8 bytes = 64 bits
        long l = 9223372036854775807l;  // practical use case are moble number, account number, distance between sun and earth, sun and moon
        System.out.println("Long value is : "+l);
        
        //5.float - 4 bytes = 32 bits
        float f1 = 123.6445456132f;
        float f2 = (float)18.546;
        System.out.println("Float value is : "+f1);
        System.out.println("Float value is : "+f2);
        
        //6.double -  8 bytes = 64 bits
        double d1 = 165.4879456613122	;
        System.out.println(d1);
        
        //7.char - stores only single digit value
        // For storing single digit, char used 2 bytes because java support Unicode + Language Codes --> Ascii codes
        //Size = 2 bytes = 16 bits
        //range : [a-z] = [97-122], [A-Z] = [65-90], [0-9] = [48 - 57]
        char c1 = '1';
        char s1 = ' ';
        char c2 = 'a';
        char c22 = 'b';
        char c3 = '$';
        
        System.out.println(s1+s1); // space has ascii value of 32 so putput is 64
        System.out.println(c2+c22); // ascii value of c is 99
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        
         //8.boolean - true/false
        //size = 1bit
        boolean flag = true;
        boolean ff = false;
        System.out.println(flag);
        System.out.println(ff);
        
        //9.String : default class in java
        //not a primitive data type
        
        String str = "Hello World";
        System.out.println(str);
        System.out.println("Hello Selenium");

	}

}
