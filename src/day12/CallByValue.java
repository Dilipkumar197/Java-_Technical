package day12;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1= new test();
		
		int number=100;
		System.out.println("Before method "+ number); //100
		
		t1.m1(number); //110
		
	    System.out.println("After method " + number ); //100

	}

}
