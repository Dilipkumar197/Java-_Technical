package day6;

public class Singledimensionalarray {

	/*
	 * single dimensional array --------- 1) Declare an array 2) add values into
	 * array 3) Find size of an array
	 * 
	 * 4) read single value from an array 5) read
	 * multiple values from an array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)Declaring array
		
		//approach1 :Declaration
		/*
		 * int a[]= new int [5];
		 * 
		 * a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50; + adding values
		
		 */
		
		//appraoch 2 
		
		int a[]= {10,20,30,40,50,60}; //Declaration
		
		//3) find the Size of array
		
		System.out.println(a.length);
		
		//4)read single value from the array
		
		System.out.println(a[2]);
		
		//5) read mutiple values from the array
		
		/*
		 * //Option1 for(int i=0;i<=5;i++) {
		 * 
		 * System.out.println(a[i]); }
		 */
		
		//Option2
		
		/*
		 * for ( int i=0; i<=a.length-1;i++) {
		 * 
		 * System.out.println(a[i]); }
		 */
		
		//option enchanaced loop
		
		for(int x :a)
			
		{
			System.out.println(x);
		}
		
	}

}
