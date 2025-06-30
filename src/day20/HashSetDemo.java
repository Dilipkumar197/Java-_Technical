package day20;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet myset = new HashSet();
		myset.add(100);
		myset.add(12.55);
		myset.add("Welcome to US");
		myset.add('c');
		myset.add(true);
		myset.add(null);
		myset.add(100);
		myset.add(12.55);
		
		//printing Hashset data 
		System.out.println(myset);
		
		//remove specific element from Hashset
		
		myset.remove(100); //here value we need to specify which we want to remove , not passing index
		
		System.out.println("AFTER Removing the specific element "+ myset);
		
		//insert an element from Hashset ///Insertion is not possible on the Hashmap concept
		
		//access/retrive the specific element from Hash Set collection is also not possible
		
		
		// convert the Hashset to ArrayList
		
		ArrayList al = new ArrayList(myset);
		
		System.out.println("After converting Hashset to ARRAY " +al);
		
	     al.get(3);
	    
	     
	     //to get the size of data
	     
	     System.out.println("Print the Size of data " + myset.size());
	     
	     //reading all the values from HashSet 
	     
	     //using enchanched For loop
	     
	     for (Object x:myset) 
	     
	     {
	    	 System.out.println(x);
	     }
		
	     
	     //removing all the elements from Hash Set
	     
	     myset.clear();
	     myset.isEmpty();
	     
	     System.out.println(myset);
		
		
		
		
		
		
		

	}

}
