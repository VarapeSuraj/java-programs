package JavaNewProgram.JavaNewProgramDemo;
import java.util.*;
// Assignment 81 WAP on arrayindexoutofbounds expection with a try catch
public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		
		try {
			for(int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
		}catch(Exception e) {
			System.out.println("ArrayIndexOutOfBoundException Exception Handled");
		}
	}

}
