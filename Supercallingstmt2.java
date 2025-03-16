package JavaNewProgram.JavaNewProgramDemo;

// Assignment 43 "WAP on super calling statement using parameterized super calling statement"

class supercallstmt2
{
	void democalling(int a, int b) {
		System.out.println("print the number = " + (a+b));
	}
}

class supercallstmt3 extends supercallstmt2{
	
	void democalling() {
		System.out.println("non paramerterized method");
	}
	
	void newmethod() {
		democalling();
		super.democalling(5, 6);
	}
}

public class Supercallingstmt2 {

	public static void main(String[] args) {
		
		supercallstmt3 s3 = new supercallstmt3();
		s3.newmethod();
	}

}
