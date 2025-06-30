package day14;


//Multi level inheritance 

class D

{
	int a;
	
	void display() {
		
		System.out.println(a);
	}
	
}


class E extends D

{
	
	int b;
	
	void show() {
		
		System.out.println(b);
	}
}


class C extends E
{
	
	int c; 
	
	void tel() {
		
		System.out.println(c);
	}
	
}
public class InheritancetypesMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C cobj = new C();
		cobj.a=20;
		cobj.b=40;
		cobj.c=60;
		
		cobj.display();
		cobj.show();
		cobj.tel();
		

	}

}
