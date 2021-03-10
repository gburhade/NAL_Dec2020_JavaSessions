package JavaSessions;

import java.util.ArrayList;

public class Users 
{
	String name;
	int id;
	String deviceList[];
	ArrayList<String> orderHistoryList;

	public static void main(String[] args) 
	{
		Users u1 = new Users();
		u1.name = "Gaurav";
		u1.id = 102;
		
		//deviceList Arrays
		u1.deviceList  = new String[3];
		u1.deviceList[0] = "Redmi Note 7 pro";
		u1.deviceList[1] = "Apple iPhone 12";
		u1.deviceList[2] = "Apple iPhone X";
		
		
		//orderHistoryList ArrayList
		u1.orderHistoryList = new ArrayList<String>();
		u1.orderHistoryList.add("Nike Shoes 2020");
		u1.orderHistoryList.add("T Shirt 2019 ");
		u1.orderHistoryList.add("Leather Wallet Feb 2019");
		
		System.out.println(u1.name + " " + u1.id);

		//printing array
		System.out.println(u1.deviceList[0]);
		for(String s: u1.deviceList)
		{
			System.out.println(s);
		}

		 //printing arraylist data
		System.out.println(u1.orderHistoryList.get(1));
		System.out.println("Ordered Items are : ");
		for(String e : u1.orderHistoryList)
		{
			System.out.println(e);
		}
		
		

	}

}
