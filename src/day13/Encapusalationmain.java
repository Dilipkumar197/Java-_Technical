package day13;

public class Encapusalationmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapuslationdemo ed= new 	Encapuslationdemo();
		ed.setAcctname("Dilip");
		ed.setAcctno(12456789);
		ed.setAmount(56789.343);
		
		System.out.println(ed.getAcctname());
		System.out.println(ed.getAcctno());
		System.out.println(ed.getAmount());

	}

}
