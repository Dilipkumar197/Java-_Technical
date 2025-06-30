package day7;

public class CheckingnofevenandoddnumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,33, 10,30,31,43};
		
		int evencount=0;
		
		int oddcount=0;
		
		for (int value:a) {
			
			if(value%2==0) {
				
				evencount++;
			}
			
			else {
				
				oddcount++;
			}
		}
		
		System.out.println("No of even numbers " + evencount);
		System.out.println("No of odd numbers "+ oddcount);
	}

}
