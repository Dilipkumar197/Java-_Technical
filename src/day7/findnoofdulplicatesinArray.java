package day7;

public class findnoofdulplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,10,30};
		
		int num=20;
		
		int count =0;
		
		/*
		 * for (int i=0;i<=4;i++) {
		 * 
		 * if(a[i]==30) {
		 * 
		 * count++; } }
		 */
		
		for ( int value:a) {
			
			if(value==num) {
				
				count++;
			}
		}

		System.out.println(count);
	}

}
