package JavaNewProgram.JavaNewProgramDemo;
import java.util.Arrays;
/*Assignment 83 WAP to count the number of alpahebets, numeric letters,spaces
and special characters used in the given String
Assignment 84 WAP on string functions using replace, replaceAll, substring, 
matches, repeat*/
public class CountAlphaNumSpace {

	public static void main(String[] args) {

		String a = " suraj 1344 34323443 2345v ar ape ";
		int count = 0;
		for(int i=0; i< a.length(); i++) {
			if(a.charAt(i) >= 48 && a.charAt(i) <= 57)
				count++;
		}
		System.out.println("The total number of numbers in a given string is: " + count);
	
		int count2 = 0;
		for(int j=0; j < a.length(); j++) {
			if((a.charAt(j) >= 65 && a.charAt(j) <= 90 )||
					(a.charAt(j) >=97 && a.charAt(j) <= 122))
				count2++;
		}
		System.out.println("The total number of charaters in a given string is: " + count2);

		int count3 = 0;
		for(int k=0;k<a.length();k++) {
			if(a.charAt(k) == 32)
				count3++;
		}
		System.out.println("The total number of spaces in a given string is: " + count3);
		
		System.out.println(a.replace("s","o"));
		System.out.println(a);
		System.out.println(a.replaceAll("s", "Y"));
		System.out.println(a);
		System.out.println(a.substring(3));
		System.out.println(a.matches(a));

	}

}
