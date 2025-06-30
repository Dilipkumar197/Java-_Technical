package assignments;

public class Checkcountofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input= 123456789;
		
		int count=0;
		
		while(input!=0) {
			
			input =input/10;
			count++;
		}

		System.out.println(count);
	}

}
