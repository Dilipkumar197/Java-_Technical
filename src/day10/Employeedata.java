package day10;

public class Employeedata {

	
		
		int id;
		
		String name;
		
		String designation;
		
		int sal;
		
		void display() {
			
			
		System.out.println(id);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(sal);
		
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Employeedata data= new Employeedata();
			
			data.id=101;
			data.name="Mouli";
			data.designation="Senior Tester";
			data.sal=50000;
			
			data.display();
			
			Employeedata data1= new Employeedata();
			data1.id=102;
			data1.name="Teja";
			data1.designation="Senior Tester";
			data1.sal=60000;
			
			data1.display();

	}

}
