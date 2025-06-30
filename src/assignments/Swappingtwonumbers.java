package assignments;

public class Swappingtwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method1(using a temp variable C)
		
		int a=10;
		
		int b=20;
		
		int c;
		
		System.out.println("The value of A before swap " + a);
		
		System.out.println("The value of B before swap " + b);
		
		c=a;
		
		a=b;
		
		b=c;

	   System.out.println("The value of A After swap " + a);
		
		System.out.println("The value of B after swap " + b);
		
		
		//method2(Using assignment operators)
		
		int x=50;
		
		int y=100;
		
		System.out.println("The value of X Before swap " + x);
		System.out.println("The value of X Before swap " + y);
		
		x+=50;
		
		y-=50;
		
		System.out.println("The value of X After swap " + x);
		System.out.println("The value of X After swap " + y);
		
		
		//Method3(Using arithmetic operators and third variable)
		
		
		int c1 =25;
		
		int d1=50;
		
		int e1=25;
		
		
		
		System.out.println("The value of C1 Before swap " + c1);
		System.out.println("The value of D1 Before swap " + d1);
		
		c1=c1+e1;
		
		d1=d1-e1;
		System.out.println("The value of C1 after  swap " + c1);
		System.out.println("The value of D1 after  swap " + d1);
		
		
	}

}
