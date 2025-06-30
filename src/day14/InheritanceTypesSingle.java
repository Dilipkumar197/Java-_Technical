package day14;


	//Single Inheritance --> Acquirng Parent class properities to child   class
	
	class A
	
	{
		int a;
		
		void display() {
			
			System.out.println(a);
		}
		
	}
	
	
	class B extends A
	
	{
		
		int b;
		
		void show() {
			
			System.out.println(b);
		}
	}

	public class InheritanceTypesSingle
	
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B bobj= new B();
		bobj.a=10;
		bobj.b=20;
		
		bobj.display();
		bobj.show();
		

	}

}
