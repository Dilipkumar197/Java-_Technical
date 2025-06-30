package assignments;

public class CheckcountofevenoroddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=25467;
		
		int evencount=0;
		
		int oddcount=0;
		
		while(num!=0) {
			
			int digit=num%10;   //extracting last digit
			
			if(digit%2==0) {
				
				evencount++;
			}
			
			else {
				
				oddcount++;
			}
			
			num=num/10;  //remove last digit
			
		}
		
		System.out.println("The no of even Numbers are " + evencount);
		System.out.println("The no of even Numbers are " + oddcount);
		

	}

}
