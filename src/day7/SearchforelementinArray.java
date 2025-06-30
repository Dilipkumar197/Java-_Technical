package day7;

public class SearchforelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 30, 45, 55, 86 };

		// int search_num=30;

		boolean status =false;
		for (int i = 0; i <= 4; i++) {

			if (a[i] == 55) {

				System.out.println("Element found");
				status=true;
				break;
			}

		}

		
		if(status==false) {
			
			System.out.println("Element not found");
		}
		
	}

}
