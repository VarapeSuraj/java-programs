package JavaNewProgram.JavaNewProgramDemo;
// Assignment 71 WAP to check if the given string is a Palindrome?
public class Palindrome {

	public static void main(String[] args) {
		String S = "level";
		String reverse = "";
		char ch;
		for(int i = 0; i<=S.length()-1; i++) {
		
			ch = S.charAt(i);
			reverse = ch + reverse;
		}	

		if(reverse.equals(S)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not a Palindrome");
		}
	}

}
