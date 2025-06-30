package day13;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			  
			 System.out.println(StaticDemo.b);    //static variable (No object required) 
			 StaticDemo.m1();                      //staticmethod ( No Object required)
			 
			 
			 StaticDemo sd= new StaticDemo(); //can be access through object 
			 sd.m2();                           //Non static Methods
			 System.out.println(sd.a) ; //Non static variables
			 
			 
			 sd.m();
			 
			
			 
			 }
			

	}


