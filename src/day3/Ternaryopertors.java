package day3;

public class Ternaryopertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// var =exp? result: result2
		
		//example1
		//here if expersion is true it will take a value otr if it is false it will take b value
		
		int a=100,b=200;
		
		int res =(a<b)? a:b;
		
		System.out.println(res);
		
		
		//example2
		int person_age =20;
		
		
		String res1 =(person_age>18)? "eligible for vote" :"Not eligible for vote"	;	
		
		System.out.println(res1);
		
		//example3
		//Example3
				int x=(1==1)?100:200;
				
				System.out.println(x);
				
		
		

	}

}
