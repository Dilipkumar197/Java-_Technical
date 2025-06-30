package day9;

import java.util.Arrays;

public class MutuableVSImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= { 20,40,50,10};
		
		int b[]=a;
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); //mutuable can change
		
		System.out.println(Arrays.toString(a));
		
		
		System.out.println(Arrays.toString(b));

	}

}
