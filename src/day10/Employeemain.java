package day10;

public class Employeemain {

	public static void main(String[] args) {
	
		//here we can acces the employee data because it is in same package.
		
		Employeedata emp1= new Employeedata();
		
		emp1.id=103;
		
		emp1.name="srinu";
		emp1.designation="Travels Agent";
		emp1.sal=50000;
		
		emp1.display();
		
		

	}

}
