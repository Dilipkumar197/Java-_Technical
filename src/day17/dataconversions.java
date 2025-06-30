package day17;

public class dataconversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scenario 1:  String ---> int, double, bool, char (not possible) (Unboxing)
		
		
		//Conversion of string to int
		
		//String s1="Welcome"; //this cannot be converted because string is in alphbetic format
		
		String s1= "20";
		String s2="40";
		
		int sum=Integer.parseInt(s1)+ Integer.parseInt(s2);
		
		System.out.println(sum);
		
		
		//String --> double
		
		
		String a1="10.5";
		String b1="11.5";
		
		double sum1= Double.parseDouble(a1)+ Double.parseDouble(b1);
		
		System.out.println(sum1);
		
		//String -->  Boolean 
		
		String t="true";
		
		boolean b=Boolean.parseBoolean(t);
		
		System.out.println(b);
		
		//String --> Char  it is not possible
		
		String C="D";
		
		//Scenario 2:  int, double, bool, char ----> String  (Autoboxing)
		
		
		int x=30;
		
		String  o=String.valueOf(x);
		
		double d=10.77;
		
		String o1=String.valueOf(d);
		
		
		boolean b2=true;
		String o2=String.valueOf(b2);
		
		char t3= 'F';
		String o3=String.valueOf(t3);
		
		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		//int to double
		
		int x5=17;
		double y=x5;
		System.out.println(y);
		
		
		//double to int
		
		double d1=11.50;
		
		int tw=(int)d1;  //type casting we shall need to apply
		
		System.out.println(tw);
		
		
		
	}

}
