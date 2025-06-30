package assignments;

public class ReverseNumberorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method1
		int num=1234;
	
	    System.out.println(num);
	    
	    int rev=0;
	    
	    while(num!=0) {
	    	
	    	rev= rev*10+num%10;
	    	num=num/10;
	    }
	    
	    
	    System.out.println(rev);
	    
	    
	    String name="Hello World";
	    
	    String rev1="";
	    
	    for(int i=name.length()-1; i>=0; i--) {
	    	
	    	rev1=rev1+name.charAt(i);
	    }
	    
		System.out.println(rev1);
	    

		
        
	}

}
