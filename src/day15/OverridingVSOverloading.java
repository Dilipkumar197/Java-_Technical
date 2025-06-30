package day15;

class XYZ

{
	void m1(int a) {
		
		System.out.println(a);
	}
	
	void m2(int b) 
	{
		System.out.println(b);
	}
	
}


class ABC extends XYZ
{
	
	void m1(int a) {       //overiding
		
		System.out.println(a*a);
	}
	
	void m2(int b) {        //overiding
		
		System.out.println(b*b);
	}
	
	
	void m2(int a , int b) {  //overloading 
		
		System.out.println(a+b);
	}
	
	
	
}
public class OverridingVSOverloading {

	public static void main(String[] args) {
		
		
		ABC abcobj= new ABC();
		abcobj.m1(10);
		abcobj.m2(20);
		abcobj.m2(30, 30);
		

	}

}
