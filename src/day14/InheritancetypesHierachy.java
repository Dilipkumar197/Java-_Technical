package day14;



class parent

{
	void display(int a) {
		
		System.out.println(a);
	}
	
}


class child1 extends parent {
	
	
	void show(int b) {
		
		System.out.println(b);
	}
	
}


class child2 extends parent{
	
	void tel(int c) {
		System.out.println(c);
		
	}
	
	
}
public class InheritancetypesHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 ch= new child1();
		ch.display(100);
		ch.show(200);
		
		child2 ch2= new child2();
		ch2.display(10);
		ch2.tel(30);
		
		
	
		

	}

}
