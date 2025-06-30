package day19;

import java.util.Scanner;

public class HandlingExcpetions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program started ");
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("ENTER A NUMBER");
		
		 int num =sc.nextInt();
		 
		 try {
		System.out.println(100/num);
		 }
		 
		 catch(ArithmeticException e) {
			 
			 System.out.println("Invalid data");
		 }
		 
		 
		 
		 //ex2
		 
		     int a[] = new int [5];
			
			System.out.println("Enter the postions (0-4)");
			
			int pos = sc.nextInt();
			
			System.out.println("Enter the value ");  //5 ArrayIndexOutOfBoundsException:
			
			int value = sc.nextInt();
			
			
			try {
				a[pos]=value;
				
				System.out.println(a[pos]);	
			}
			
			catch(Exception e) {
				
				System.out.println("Invalid data passed");
				System.out.println(e.getMessage());
			}

		 System.out.println("Program completed ");

	}

}
