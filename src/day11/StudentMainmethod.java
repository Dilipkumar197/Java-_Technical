package day11;

public class StudentMainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here we are using data by taking object as reference
		
		//Student stu= new Student();
		/*
		 * stu.id=101; 
		 * stu.name="Dheeraj";
		 * stu.grade='A';
		 * stu.printstudata();
		 */	
		
		
		//assiging data by user defined method
		/* stu.Setstudata(103, "Kavya", 'B') */;
		
		
		//Using contructor --> Syntax constructor name should same as class name 
		
		// constructor never return value
		
		
		Student stu= new Student(105 , "Teja",'D');
		stu.printstudata();

	}

}
