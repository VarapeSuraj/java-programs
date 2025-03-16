package JavaNewProgram.JavaNewProgramDemo;
//Assignment 70 WAP to reverse a string
public class ReverseAString {

	public static void main(String[] args) {
		
		String S = "Java";
		String reverse = "";
		char ch;
		for(int i = 0; i<=S.length()-1; i++) {
		
			ch = S.charAt(i);
			reverse = ch + reverse;
		}		
		System.out.println(reverse);
	}

}
