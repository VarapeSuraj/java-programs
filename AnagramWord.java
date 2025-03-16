package JavaNewProgram.JavaNewProgramDemo;

import java.util.Arrays;

// Assignment 82 WAP to find out if the given 2 strings are anagram                
public class AnagramWord {

	public static void main(String[] args) {
		
		String a = "act";
		String b = "cat";
		
		if(a.length() != b.length())
			System.out.println("Given Both Strings are not Anagram");
		else
		{
			System.out.println("Lets find the strings are anagram or not");
			char c1[] = a.toCharArray();
			char c2[] = b.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean b2 = Arrays.equals(c1, c2);
			if(b2 == true)
				System.out.println("Given Both Strings are Anagram");
			else
				System.out.println("Given Both Strings are not Anagram");
		}
	}

}
