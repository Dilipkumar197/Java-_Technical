package day19;

import java.util.Scanner;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program started");
		
		
		Scanner sc= new Scanner(System.in);
		
		/* * 
		 * System.out.println("ENTER A NUMBER");
		 * 
		 * int num =sc.nextInt();
		 * 
		 * System.out.println(100/num);
		 */   //arithemtic exception

	
		
		
		//eg2:
		String s="5678";
		
		int num1 = Integer.parseInt(s);
		
		System.out.println(num1);
		
		System.out.println("Program completed");
		
		//eg3
		
		/*
		 * String s1="Hello world";
		 * 
		 * int num2=Integer.parseInt(s1);
		 * 
		 * System.out.println(num2);    //number format exception
		 */
		
		
		//eg4:
		/*
		 * String s2=null;
		 * 
		 * System.out.println(s2.length());
		 */ //null point exception
		
		//eg5:
		
		int a[] = new int [5];
		
		System.out.println("Enter the postions (0-4)");
		
		int pos = sc.nextInt();
		
		System.out.println("Enter the value ");  //5 ArrayIndexOutOfBoundsException:
		
		int value = sc.nextInt();
		
		a[pos]=value;
		
		System.out.println(a[pos]);
		
		
		

	}

}
