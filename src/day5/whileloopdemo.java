package day5;

public class whileloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//exmple1
		// For Loop statement three main points keep in mind (Initilaztion , condition, Increment)
		
		/*
		 * int i=1; //intilization
		 * 
		 * 
		 * while (i<=10) // Condition { System.out.println(i);
		 * 
		 * i++; //increment value by 1
		 * 
		 * // i=i+1; Alternate incrementing // ++i; Alternate incrementing
		 * 
		 * 
		 * }
		 */
		
		
		//example 2
		
		/*
		 * //print hello 10 times
		 * 
		 * int a=1; //intilization
		 * 
		 * while(a<=10) ///condition {
		 * 
		 * System.out.println("Hello"); a++; //Incrementation }
		 */
		
		
		//example3 print even numbers from 1 to 10
		
		/*
		 * int b=1;
		 * 
		 * while(b<=10) { if(b%2==0) {
		 * 
		 * System.out.println(b); } b++; }
		 */
		
		
		/*
		 * //Example 4 approach two for print even numbers
		 * 
		 * int d=2;
		 * 
		 * while(d<=10) {
		 * 
		 * System.out.println(d); d+=2; }
		 */
		
		//Example 5 approach two for print odd numbers
		
		/*
		 * int a=1;
		 * 
		 * while(a<=10) {
		 * 
		 * if(a%2!=0) {
		 * 
		 * System.out.println(a); }
		 * 
		 * a++; }
		 */
		
		
		//Example6 Print numbers frm reverse that is 10 ,9,8,7,6,5,4,3,2,1
		
		int i=10; //First initilzation
		
		while(i>=1) //condition
		
		
		{
			System.out.println(i);
			i--; //decrement the value by -1
		}
		
		
	}

}
