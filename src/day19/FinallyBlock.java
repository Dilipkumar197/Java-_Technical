package day19;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" Hello Selenium";
		
		try {
		System.out.println(s.length());
		}
		
		catch( Exception e) {
			
			System.out.println("Handled Exception");
		}
		
		finally {
			
			System.out.println(" at last finally block is excuted");
		}
	}

}
