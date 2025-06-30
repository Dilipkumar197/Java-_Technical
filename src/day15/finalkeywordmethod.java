package day15;

class test1 {
	
	final void m1() {   //here we keeping our method constant by using final keyword so overriding cant be done
		
		System.out.println(" this is m1 method from test1");
	}
	
}


class test2 extends test1

{
	//void m1()
	
	{
		
		System.out.println("this is m1 method from test2");
	}
}


public class finalkeywordmethod {

	public static void main(String[] args) {


	}

}
