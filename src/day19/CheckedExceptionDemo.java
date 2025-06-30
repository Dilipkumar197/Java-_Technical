package day19;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Program started");
		System.out.println("Program in progress");
		
		/*
		 * try { FileInputStream file = new
		 * FileInputStream("C:\\Users\\DILIP KUMAR\\Downloads"); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\DILIP KUMAR\\\\Downloads");
		
		System.out.println(file.read());
		
		System.out.println("Program is completed");

	}

}
