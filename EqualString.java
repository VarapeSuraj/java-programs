package JavaNewProgram.JavaNewProgramDemo;
// Assignment 69 WAP on String Function using equals and equalsIgnoreCase concept

public class EqualString {

	public static void main(String[] args) {
		
		String a = "SURAJ";
		String b = "suraj";
		
		if(a.equals(b) == true)
			System.out.println("Strings are equals");
		else
			System.out.println("Strings are not equals");
		
		if(a.equalsIgnoreCase(b) == true)
			System.out.println("Strings are equals");
		else
			System.out.println("Strings are not equals");		
	}
}
