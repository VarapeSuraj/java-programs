package JavaNewProgram.JavaNewProgramDemo;
// Assignment 72 WAP on basic concepts of Array
// Assignment 73 WAP on String Function using toCharArray concept
import java.lang.reflect.Array;
import java.util.*;

public class ArraySimple {

	public static void main(String[] args) {
		int[] in = new int[4];
		in[0] = 1;
		in[1] = 2;
		in[2] = 3;
		in[3] = 4;
		System.out.println(Array.getInt(in, 3));
		
		int a[] = {1,2,3,4,5};

		String a1 = Arrays.toString(a);
		System.out.println(a1);
		
		String AD = "JAVA";
		char[] ss = AD.toCharArray();
		System.out.println(ss);
	}

}
