package day20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declaration
		ArrayList mylist= new ArrayList();  
		
		//List list = new ArrayList();
		
		//ArrayList <String> mylist1= new ArrayList<String>();
		
		//adding data into arrayList
		
		mylist.add(100);
		mylist.add(11.40);
		mylist.add("Weclome to hyd");
		mylist.add('D');
		mylist.add(true);
		mylist.add(null);
		mylist.add(null); 
		mylist.add(100);
		
		
		
		
		//To get the size of array list
		
		System.out.println("To get the size of array list "+ mylist.size());
		
		
		//To print the  array list
		
	    System.out.println("To print the  of array list "+ mylist);	
	    
	    
	    //remove specific element from the existing arraylist
	    
	    mylist.remove(7); //here i am removing 100 which is there mutiple times
	    
	    System.out.println("Printing after removing the duplicates " + mylist);
	    
	    //insert element on the arraylist
	    
	    mylist.add(3, "Welcome to Vizag");
	    
	    
	    System.out.println("Printing the data after inserting the data "+ mylist);
	    
	    //to modify/replace/change  element on the array list
	    
	    mylist.set(3, "Welcome to Vijayawada");
	    System.out.println("Printing the data after moidifying "+ mylist);
	    
	    //to access the specific data
	    
	   System.out.println(mylist.get(2)); 
	   
	   //reading all the elements from the arraylist
	   
	   //using normal for loop
	   
	   /*
	   for(int i=0;i<=mylist.size()-1; i++)
		   
	   {
		   System.out.println(mylist.get(i));
		   
	   }
	    
	    */
	    
	    //using enchanched for loop
	   
	   for ( Object x:mylist)
	   {
		   
		   System.out.println(x);
	   }
		
	   
	   //using iterator
	   
	   //checking array list if false or method
	   
	   System.out.println(mylist.isEmpty());

	   //remove mutiple elements frm arraylist
	   
	   ArrayList mylist2= new ArrayList();
	   mylist2.add(11.4);
	   mylist2.add("Weclome to hyd");
	   
	 mylist.removeAll(mylist2);
	 
	 System.out.println(mylist);
	 
	 //remove all the elements at a time

	 mylist.clear();
	 System.out.println(mylist.isEmpty());
	 
	 System.out.println(mylist);
	   
	}

}
