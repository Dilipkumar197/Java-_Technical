package day13;

public class StaticDemo {
	
	int a=10;    //Non static variable
	
	static int b=20; //static variable 
	
	static void m1()  //static method
	
	{
		
		System.out.println("This is static method");
	}
	
	
	void m2() //Non static method
	
	{
		
		System.out.println("This is non static method");
	}
	
	// Non static 
	void m() {      
		
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * System.out.println(b);             //static variable (No object required) 
	 * m1();                               //static  method ( No Object required)
	 * 
	 * 
	 * StaticDemo sd= new StaticDemo(); //can be access through object 
	 * sd.m2();                            //Non static Methods 
	 * 
	 * System.out.println(sd.a) ;              //Non static variables
	 * 
	 * 
	 * sd.m();
	 * 
	 * 
	 * 
	 * }
	 */

}
