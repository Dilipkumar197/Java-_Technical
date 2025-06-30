package day16;

public class MutipleInheritance implements I1 ,I2


{
  public void m1() {
	  
	  
	  System.out.println("This is m1 method");
  }
  
  public void m2() {
	  
	  System.out.println("This is m2 method");
  }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MutipleInheritance m1= new MutipleInheritance();
		m1.m1();
		m1.m2();
		System.out.println(m1.length);
		System.out.println(m1.width);
	}

}
