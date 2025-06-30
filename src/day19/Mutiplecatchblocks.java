package day19;

public class Mutiplecatchblocks {

	public static void main(String[] args) {
		
		try {
		 String s2=null;
		System.out.println(s2.length());
		}
		
		catch(Exception e) {
			
			System.out.println("Exception Handled");
			System.out.println(e.getMessage());
			
		}
	

	}

}
