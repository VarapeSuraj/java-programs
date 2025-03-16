package JavaNewProgram.JavaNewProgramDemo;
import java.lang.reflect.Array;
import java.util.Arrays;
// Assignment 78 WAP to copy one array into another array
// Assignment 79 WAP to copy one array into another array in reverse order
// Assignment 80 WAP on Array Function using Arrays.toString and Arrays.sort concept

public class CopyTwoArray {

	public static void main(String[] args) {

		int[] a = {5,1,4,2,3};
		String a1 = Arrays.toString(a);
		Arrays.sort(a);
		 System.out.print("Sorted Array is: ");
	        for (int n : a) {
	            System.out.print(n + " ");
	        }
	        
	    System.out.println("");    
		System.out.println("Original Array " + a1);
		int b[] = new int[a.length];

		for(int i=0;i<=a.length-1;i++) {
			b[i] = a[i];
		}
		System.out.println("Copied Array " + Arrays.toString(b));
		
		for(int j=0;j<a.length / 2;j++) {
			
			int t = a[j];
			a[j] = a[a.length - 1 - j];
			a[a.length - 1 - j] = t;
		}
		System.out.println("Array in Reverse order " + Arrays.toString(a));

	}

}
