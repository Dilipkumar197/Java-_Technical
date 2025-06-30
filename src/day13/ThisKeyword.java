package day13;

public class ThisKeyword {
	
	
	int x ,y;  //class variable/instance variable
	
	void setdData(int x , int y) {   //a and b are local varaible
		
		
		this.x=x;
		this.y=y;
		
	}
	
	
	void display() {
		
		System.out.println(x + "   " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword th= new ThisKeyword();
		th.setdData(10 , 30);
		th.display();

	}

}
