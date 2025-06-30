package assignments;

public class CheckSumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5678;
		
		int sum=0;
		
		while(num!=0) {
			
			sum=sum+num%10;  //extract last digit
			num=num/10;
		}

		 //remove last digit
		
		System.out.println("The sum of Number is  " + sum);
	}

}
