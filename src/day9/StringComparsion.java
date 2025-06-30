package day9;

public class StringComparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case1
		
		/*
		 * String s1="welcome";
		 * 
		 * String s2="welcome";
		 * 
		 * System.out.println(s1==s2); //true System.out.println(s1.equals(s2)); //true
		 */		
		
		/*
		 * //case2 String s1=new String("welcome");
		 * 
		 * String s2= new String("welcome");
		 * 
		 * System.out.println(s1==s2); //fasle becuase == s1 and s2 compare the objects for s1 and s2
		 * System.out.println(s1.equals(s2)); //true becuase equals compare the values
		 */
		
		
		/*
		 * //case3 String s1="welcome";
		 * 
		 * String s2= new String("welcome");
		 * 
		 * System.out.println(s1==s2); //fasle becuase == s1 and s2 compare the objects for s1 and s2 
		 * System.out.println(s1.equals(s2)); //true becuase equals
		 * compare the values
		 */
		
		
		//case4
		String s1="welcome";
		
		String s2= new String("welcome");
		
		String s3=s2;
		
		System.out.println(s1==s2); // false 
		 System.out.println(s1.equals(s2)); //true
		 
		 System.out.println(s2==s3);//true
		 System.out.println(s1.equals(s3));//true
		
		
	}

}
