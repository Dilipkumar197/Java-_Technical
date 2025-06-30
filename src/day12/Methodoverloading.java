package day12;

public class Methodoverloading {

	
	
	int a = 10, b = 20;

	//1) Simple method
	void sum() {

		System.out.println(a + b);
	}

	//2) Here methods name are same but parameters we hve passed like int x , int y
	void sum(int x, int y) {

		System.out.println(x + y);
	}

	//3) Here methods name are same but parameters we have passed like double x , double y
	void sum(double x, double y) {

		System.out.println(x + y);
	}

	//4)Here methods name are same but parameters we have passed like int x , double y
	void sum(int x, double y) {

		System.out.println(x + y);
	}

	//5)Here methods name are same but parameters we have passed like double y , int x
	void sum(double y, int x) {

		System.out.println(x + y);
	}

}
