package day4;

public class Checkthelargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//checking which nnumber is largest
		
		/*
		 * a>b and a>c -- a is largest 
		 * b>a and b>c --- b is largest
		 *  c>a and c>b -- c
		 * largest
		 */
		
		int a=30 , b=40,c=50;
		
		///here we are checking mutiple expersions in if block
		if(a>b && a>c)
			
		{
			System.out.println("A is largest Number");
		}
		
		else if(b>a && b>c) 
		{
			
			System.out.println("B is Largest number");
		}

		else {
			
			System.out.println("C is Largest Number");
		}
	}

}
