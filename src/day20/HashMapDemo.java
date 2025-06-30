package day20;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration
		/* HashMap hm= new HashMap(); */
		
		HashMap<Integer , String > hm=new HashMap<Integer , String >(); 
		
		
		//adding Keys &  /values
		
		hm.put(101,"John");
		hm.put(102,"Dilip");
		hm.put(103 ,"King");
		hm.put(102, "Dheeraj");
		hm.put(104,"Kavya");
		hm.put(105 , "Divya");
		
		System.out.println(hm);
		
		//to know the size of pair
		
		System.out.println(hm.size());
		
		//to remove the specific pair(Both key and value)
		
		hm.remove(101);  //101 is the key of pair
		
		System.out.println("Printing after removing pair " + hm);
		
		
		// to access the specific pair
		
		System.out.println(hm.get(102));
		
		
		// to get all the Keys from HashMap
		
		System.out.println(hm.keySet());

		// to get all the values from Hashmap
		System.out.println(hm.values());
		
		// to get all the Keys and values from Hashmap
		System.out.println(hm.entrySet());
		
		
		//reading data from HashMap
		
		//using enchancehd for loop
		
		for (int k: hm.keySet())
		
		{
			System.out.println(k+  "      " + hm.get(k));
			
		}
		
		
		
		
		
	}

}
