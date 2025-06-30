package day9;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Approach 1
		
	String name="Cypess";
	
	String reverse="";
	
	for ( int i=name.length()-1;i>=0;i--) {
		
		reverse = reverse+name.charAt(i);
	}

	System.out.println("Reverse string is "+ reverse);
	}
	
	
	//Approach 2--> By converting string to array
				/*String s="welcome";
				String rev="";
				
				char a[]=s.toCharArray();  // this will convert string to character type array
				System.out.println(Arrays.toString(a));  //[w, e, l, c, o, m, e]
				
				for(int i=a.length-1;i>=0;i--)
				{
					rev=rev+a[i];
				}
				
				System.out.println("Reverse string:"+ rev);
				*/	
		
		//Method3 - using StringBuffer
				/*
				StringBuffer s=new StringBuffer("welcome");
				System.out.println(s.reverse());
				*/
				
				//Method4 - using StringBuilder
				/*
				 * StringBuilder s=new StringBuilder("welcome");
				 * System.out.println(s.reverse());
				 */
		
		
	

}
