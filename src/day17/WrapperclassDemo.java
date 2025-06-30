package day17;

public class WrapperclassDemo {

	public static void main(String[] args) {
	
		
		//primitive 
		int i=10;
		double d=10.5;
		char c ='A';
		boolean b = true;
		
		//convrting permitive type to obj type   -->autoboxing
		
		Integer iobj=i;
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		//converting obj type to permitive type  -->unboxing
		
		int intvalue=iobj;
		double doublevalue =dobj;
		char charactervalue=cobj;
		boolean boolvalue=bobj;
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charactervalue);
		System.out.println(boolvalue);
	}

}
