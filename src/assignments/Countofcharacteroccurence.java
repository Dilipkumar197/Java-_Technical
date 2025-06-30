package assignments;

public class Countofcharacteroccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="Hello welcome to Java Selenium";
		
		int total_length=a.length(); //will get the length of string
		
		int total_length_after_removecharacter=a.replace("o","").length();
		
		int count =total_length-total_length_after_removecharacter;
		
		System.out.println("Total length of string  " + total_length);

		System.out.println("Total length after removing charcter " + total_length_after_removecharacter);
		
		System.out.println("Count of charcater occurence is " + count);
		
		
		
	}

}
