package assignments;

public class RemoveJunkcharactersonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Wel#$#$#$@come!@!@@#@#To##@#Java%^%^%^%^18";
		
		String S1=s.replaceAll("[^a-zA-Z0-9]", "");
		
	  System.out.println(S1);

	}

}
