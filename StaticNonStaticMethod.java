package JavaNewProgram.JavaNewProgramDemo;

public class StaticNonStaticMethod {

	static int a = 100;
	/* int ab = 100;
	 ab = 90;*/

	public static void main(String[] args) {

		/* Assignment 17 WAP to declare a variable inside a static and non static
		 *  Method. For local variable. 
		 * Assignment 18 WAP to declare a Global variable.
		 */
		
		one();
		two();
		StaticNonStaticMethod hi = new StaticNonStaticMethod();
		hi.three();
		hi.four();
		System.out.println("integer is = " + a);
	}

	static void one() {
		String S = "String";
		System.out.println("string is = " + S);

	}

	static void two() {
		int i = 7;
		System.out.println("integer is = " + i);
	}

	void three() {
		float f = 3.37f;
		System.out.println("float is = " + f);
	}

	void four() {
		char c = 'C';
		System.out.println("char is = " + c);
	}
}
