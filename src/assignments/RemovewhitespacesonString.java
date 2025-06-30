package assignments;

public class RemovewhitespacesonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = " D I L I P K U M A R";
		
		name=name.replaceAll("\\s", ""); //s defienes the space in java
		
		System.out.println(name);
		
		String course ="Selenium with Java";
		
		course =course.replace("\\s", "");
		
		System.out.println(course);

	}

}
