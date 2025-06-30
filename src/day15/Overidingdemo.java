package day15;

class bank

{

	double roi() {

		return 0;
	}
}

class ICICI extends bank

{

	double roi() {

		return 10.5;
	}
}



class SBI extends bank

{

	double roi() {

		return 11.5;
	}
}




public class Overidingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICI ic = new ICICI ();
		System.out.println(ic.roi());  //10.5
		
		SBI sb= new SBI();
		System.out.println(sb.roi());   //11.5

	}

}
