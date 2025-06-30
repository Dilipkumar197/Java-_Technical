package day12;

public class Constructoroverloading {

	
	double width , height, depth;
	
	//1) Default contsructor , no paramters are passed
	Constructoroverloading(){
		
		width=0;
		height=0;
		depth=0;
	}
	
	//2)Paramertized constructor because we are passing the parameters here
	
	Constructoroverloading(double W , double H , double D){
		
		width=W;
		height=H;
		depth=D;
		
		
	}
	
	
	//3)
	
     Constructoroverloading(double len ){
		
		width=len;
		height=len;
		depth=len;
		
		
	}
     
     
     double volume() {
    	 
    	 return(width * height * depth);
     }

	
}
