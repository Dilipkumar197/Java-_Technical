package day18;

//upcasting --> converting value from smaller to larger 

// int to long --> Upcasting

//float --> double --> Upcasting

//downcasting --> Converting value from larger to smaller

//long to int --> Downcasting

//double to float--> Downcasting



public class TypecastingConcept {

	public static void main(String[] args) {
		
		//upcasting--- automatic  --> smaller to larger
		
		int intvalue=100;
		
		long longvalue=intvalue;
		
		System.out.println(longvalue);
		
		
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		//downcasting --manually -->.larger to smaller
		
		long longvalue1=10000;
		int intvalue1=(int)longvalue;  //here we have to use int as reference before long
		
		System.out.println(intvalue1);
		
		
		double doublevalue1=134.5555;
		float floatvalue1=  (float) doublevalue1;
		
		System.out.println(floatvalue1);
		
	
       //example1 --> upcasting
		
		int i=15;
		
		double d=i;
		System.out.println(d);
		
		//example2 --> downcasting
		
		double d1=16.66;
		int i1= (int)d1;
		System.out.println(i1);
		
		

	}

}
