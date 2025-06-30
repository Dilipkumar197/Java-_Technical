package day11;

public class ConstructorDemo {
	
	
	
	int x ,y;
	
	 ConstructorDemo()  //default constructor because here we didnt passing any parameters
	 
	 {
		 x=10;
		 y=20;
		 
	 }
	 
	 
      ConstructorDemo(int a , int b)  //Paramterized constructor because here we are  passing the   parameters
	 
	 {
		 x=a;
		 y=b;
		 
	 }
      
      void sum()
      
      {
    	  
    	  System.out.println(x+y);
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // ConstructorDemo cd= new  ConstructorDemo(); //default constructor will invoke
		 // cd.sum();
		
		 //paramterized constructor will invoke because we are passing the values
		
		ConstructorDemo cd= new ConstructorDemo(100 ,400);

		cd.sum();

	}

}
