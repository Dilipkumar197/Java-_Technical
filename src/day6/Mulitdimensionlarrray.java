package day6;

public class Mulitdimensionlarrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1) aproach 1
		// declaration

		int a[][] = new int[3][2];

		// adding values

		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		// 1)approach 2 declaring and adding the values

		int a1[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		// 3)to find the size of rows and columns

		System.out.println(a.length);
		System.out.println(a[0].length);

		// 4) To read the single value

		System.out.println(a[1][0]);

		// 5) Reading data from two dimensional  Array
		
		/*
		 * for ( int i=0;i<=a.length-1;i++) {
		 * 
		 * for (int j=0;j<=a[1].length-1;j++){
		 * 
		 * System.out.println(a[i][j] + "  "); }
		 * 
		 * System.out.println(); }
		 */
		
		
		//6)reading data from two dimensional array
		
		for ( int arr[]:a) {
			
			for (int x:arr) {
				
				System.out.print(x + " ");
			}
			
			System.out.println();
		}

	}

}
