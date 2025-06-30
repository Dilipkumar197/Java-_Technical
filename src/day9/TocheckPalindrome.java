package day9;

public class TocheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="level";
		
		String rev="";
		
		for ( int i=name.length()-1; i>=0;i--) {
			
			
			rev=rev+name.charAt(i);
			
		}
		
		if(name.equals(rev)) {
			
			System.out.println("The given text is palindrome");
		}
		
		else {
			
			System.out.println("The given text is not palindrome");
		}
	}

}
