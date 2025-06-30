package day12;

public class ConstructorOverLoadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1)default contructor will take because we are not sending any values
		Constructoroverloading con = new Constructoroverloading();
		System.out.println(con.volume());
		
		
		//2)Parameterized contructor will take because we are sending some values
		Constructoroverloading con1 = new Constructoroverloading(10.5 , 20.5 ,20.6);
		System.out.println(con1.volume());
		
		//2)Parameterized contructor will take because we are sending some values
		Constructoroverloading con2 = new Constructoroverloading(11);
		System.out.println(con2.volume());
						
				
		
	}

}
