package day15;

public class Animal {

	String color = "White";

	void eat() {

		System.out.println("Animal is eating");
	}

	Animal() {

		System.out.println("My animal ");
	}

	Animal(String name)
	{
		System.out.println(name);
	}
}

class Dog extends Animal

{

	String color = "black";

	void breedcolortype() {

		System.out.println(super.color); // invoke the parent class variable
	}

	void eat() {

		// System.out.println("Animal is eating bread");

		super.eat(); // invoke the parent class method
	}

	Dog() {

		super(); // invoke the parent class constructor.

		// System.out.println("Neighbor Animal");
	}
	
	Dog(String name){
		
		super();
		System.out.println(name);
	}
}
