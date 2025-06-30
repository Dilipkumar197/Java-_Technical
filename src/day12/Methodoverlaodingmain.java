package day12;

public class Methodoverlaodingmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading md= new Methodoverloading();
		md.sum(); //1
		
		md.sum(11.5 , 20); //5
		 
		md.sum(12.5 ,12.5);  //3
		
		md.sum(10,20);    //2
		
		md.sum(10,20.5); //4

	}

}
