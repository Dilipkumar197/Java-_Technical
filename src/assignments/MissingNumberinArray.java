package assignments;

public class MissingNumberinArray {

	public static void main(String[] args) {

		int a[]= {1,4,5,3};
		
		int b[]= {1,2,3,4,5};
		
		int sum1=0;
		
		int sum2=0;
		
		
		for ( int i=0; i<=3; i++) {
			
			
			sum1=sum1+a[i];
		}
		
		
		for ( int j=0;j<=4;j++) {
			
			
			sum2=sum2+b[j];
		}
		
		System.out.println(sum1);
		
		System.out.println(sum2);
		
		System.out.println("Missing Number is "+ (sum2-sum1));
		

	}

}
