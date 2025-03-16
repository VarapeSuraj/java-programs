package JavaNewProgram.JavaNewProgramDemo;
// Assignment 76 WAP to accept the values of your array at run time
import java.util.*;

public class ArraysRunTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int ar[] = new int[sc.nextInt()];	
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println("Enter the value of arrays");
			ar[i] = sc.nextInt();
		}
		System.out.println("The arrays values are" + Arrays.toString(ar));
		
	}

}
