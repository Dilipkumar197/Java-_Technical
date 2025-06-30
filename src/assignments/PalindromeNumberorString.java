package assignments;

public class PalindromeNumberorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;
		
		System.out.println("The Number values before revese is " + num);
		
		int rev=0;
		
		while(num!=0) {
			
			rev= rev*10+num%10;
			num=num/10;
			
		}
		
		System.out.println("The Number value after  revese is " +rev);
		
		
		String input="Level";
		
		String reverse="";
		
		
		for (int i=input.length()-1;i>=0;i--) {
			
			reverse =reverse+input.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
