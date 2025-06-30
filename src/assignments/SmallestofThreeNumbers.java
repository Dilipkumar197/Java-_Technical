package assignments;

public class SmallestofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		 
		int b=3;
		
		int c=10;
		
		
		if(a<b && a<c) {
			
			System.out.println("A is Smallest Number");
		}
		
		else if(b<a &&  b<c)
		{
			
			System.out.println("B is Smallest Number");
		}
		
		else if(c<a && c<b) {
			
			System.out.println("C is smalllest Number");
		}
		
		
		else {
			
			System.out.println("None is the smallest Number");
		}
	}

}
