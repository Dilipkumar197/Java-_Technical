package assignments;

public class CheckevenoroddnumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[]= {1,2,3,4,5,6,7,8,9};
	
	int evencount=0;
	int oddcount=0;
	
	for (int i=0;i<=8;i++) {
		
		if(a[i]%2==0) {
			
			evencount++;

		}
		
		else {
			
			oddcount++;
			
		}
		
	}
	
	System.out.println(evencount);
	System.out.println(oddcount);

	}

}
