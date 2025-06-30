package day11;

public class Student {
	
	int id;
	
	String name;
	
	char grade;
	
	void printstudata() {
		
		System.out.println(id + " " + name + "  "+ grade);
	}
	
	
	void Setstudata(int sid , String sname  , char g)
	
	{
		id=sid;
		name=sname;
		grade=g;
		
	}
	
	//constructor
	
	Student(int sid , String sname  , char g)
	
	{
		
		id=sid;
		name=sname;
		grade=g;
		
	}

}
