package day4;

public class NestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if conditions will print Only when it is true or else it will take else

		/*
		 * //ex1 if(true) {
		 * 
		 * System.out.println("a"); }
		 * 
		 * else {
		 * 
		 * System.out.println("b"); }
		 */

		// ex2

		/*
		 * if(false)
		 * 
		 * {
		 * 
		 * System.out.println("C"); }
		 * 
		 * else {
		 * 
		 * System.out.println("D"); }
		 */

		// nested f else statment
		
		//First it will check outer if condition it is true means it will go for Inner if condition

		if (4 == 4) {

			if (2 == 1) {

				System.out.println("ABC");
			}
			
			else {
				System.out.println(123);
			}

		}

		else {

			System.out.println("XYZ");
		}

	}

}
