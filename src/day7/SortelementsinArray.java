package day7;

import java.util.Arrays;

public class SortelementsinArray {

	public static void main(String[] args) {

		
		// Sorting numbers
		

		int a[] = { 10, 45, 35, 20, 60 };

		System.out.println("Before sorting :" + Arrays.toString(a)); // before sorting the values { 10,45,35,20,60}

		Arrays.sort(a);

		System.out.println(" After sorting " + Arrays.toString(a));
		
		//Sorting Strings
	
		String  S[]= {"C" ,"E" ,"A","D","L"};
		
		System.out.println("Before sorting the string" + Arrays.toString(S));  //{"C" ,"E" ,"A","D","L"};
		
		Arrays.sort(S);
		
		System.out.println("After sorting the string "+ Arrays.toString(S));

	}

}
