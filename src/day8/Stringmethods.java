package day8;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Hello World";
		
		System.out.println(s);
		
	   //to find the Length of string
		
		String s1="Deepu";
		
		System.out.println(s1.length());
		
		
		//concat -Joint to string
		
		String a1="Welcome";
		
		String b1="to Java";
		
		String c1="Programming";
		
		
		
		System.out.println(a1+b1);
		System.out.println(a1.concat(b1));
		
		System.out.println(a1+b1+c1);
		
		
		//trim()- remove space from left side and right side
		
		
		String x="   Dilipkumar   ";
		
		System.out.println("Before Trim "+ x.length()); //16
		
		String x1 = x.trim();
		
		System.out.println("After trim "+ x1.length());  //10
		
		//charAt() -returns a character bases on index
		
		//index start from 0
		
		String f1="Welcome";
		
		System.out.println(f1.charAt(3)); // C will  print
		
		System.out.println(f1.charAt(5)); //M will print
		
		//contains()-returns true or false
		
		String z="Harish";
		
		System.out.println(z.contains("Har")); //true 
		
		System.out.println(z.contains("har"));  //false
		

		
		//equals() and equalsignorecase() --> compare 2 strings
		//returns true or false

		String f2="Welcome";


		String f3="Welcome";
		
		System.out.println(f2.equals(f3));//true
		
		String D2="World";


		String D3="world";//true
		System.out.println(D2.equals(D3)); //False
		
		System.out.println(D2.equalsIgnoreCase(D3)); //True
		
		//replace()- replace single character/sequence of characters in a string
		
		String S7="Welcome to my qa automation classes";
		
		System.out.println(S7.replace('e', 'a'));//Walcoma to my qa automation classas
		
		System.out.println(S7.replace("classes", "Training")); //Welcome to my qa automation Training
		
		
		//substring --extract from the main string
		
		
		String h1="QA automation";
		
		System.out.println(h1.substring(0, 9));  //QA automa
		
		System.out.println(h1.substring(1, 4));  //A a
		
		
		//converting to lower case and Upper case 
		
		String g1="Welcome to Hyd";
		
		System.out.println(g1.toLowerCase());
		System.out.println(g1.toUpperCase());
		
		//split -Split/divide the string  into mutiple parts with delimeter
		
		//eg1
		String c4="dfg@tyx";
		
		String c5[]=c4.split("@");
		
		System.out.println(c5[0]); //dfg
		
		System.out.println(c5[1]); //tyx
		
		//eg2
		String t5="abcd@xyz.com";
		
		String t6[]=t5.split("@"); 
		
		System.out.println(t6[0]);  //abcd
		
		System.out.println(t6[1]); //xyz.com
		
		
		//eg3
		
		//use replace method
		String amount ="$15,45,30"; //output should be 154530 here we need to remove $ and (,)
		
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		
		//eg4 
		
		String name ="abc,1244@gmail.com"; // output should be  abc 1244 gmail.com
		
		
		String a5[]=name.split(",");
		
		System.out.println(a5[0]); //abc 
		
		System.out.println(a5[1]);  //1244@gmail.com
		
		String a6[]=a5[1].split("@");
		
		System.out.println(a6[0]); //1244
		
		System.out.println(a6[1]);  //gmail.com
		
		
		String y="abc xyz def";
		
		String arr[]=y.split(" ");
		System.out.println(Arrays.toString(arr)); // [abc, xyz, def]
		
		
		// + % & () ==> you cannt use as deliemters
		
		
		String d5 ="Dilip kumar";
		
		System.out.println(d5.contains("Dilip")); //true
		
		System.out.println(d5.replace('D', 'd').contains("dilip"));
		
		System.out.println(d5.toLowerCase().contains("dilip"));
		
	}

	

}
