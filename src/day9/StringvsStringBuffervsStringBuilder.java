package day9;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is immutable -here we cannot the existing the value
		String s="welcome";
		
		s.concat("to java");
		
		System.out.println(s);// welcome 
		
		
		//StringBuilder is mutable -here we can the existing the value
		StringBuilder s1= new StringBuilder("welcome");
		s1.append("to Java");
		System.out.println(s1); //welcome to java
		
		
		//StringBuffer is mutable -here we can the existing the value
		StringBuffer s2= new StringBuffer("welcome");
		s2.append("to Python");
		System.out.println(s2); //welcome to Python

	}

}
