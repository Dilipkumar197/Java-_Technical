package day5;

public class Forloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// example1 print no 1 to 10

		/*
		 * for ( int i=1; i<=10; i++) {
		 * 
		 * System.out.println(i); }
		 */

		// example2 :Print the nos from 10 to 1

		/*
		 * System.out.println("Reverse the numbers");
		 * 
		 * for(int a=10;a>=1;a--) {
		 * 
		 * System.out.println(a); }
		 */

		/*
		 * //example3 :Print only the even Numbers using only for loop
		 * 
		 * for( int i=2; i<=10; i+=2) {
		 * 
		 * System.out.println(i); }
		 */

		// example4 :Print only the even Numbers using only for loop and if condition

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {

				System.out.println(i);
			}
		}

	}

}
