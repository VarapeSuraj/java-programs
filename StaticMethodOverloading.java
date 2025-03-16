package JavaNewProgram.JavaNewProgramDemo;

public class StaticMethodOverloading {

	public static void main(String[] args) {
		/*
		 * Assignment 14 WAP with combination of 3 static parameterized methods and try
		 * calling them inside main method
		 */
		callnew(50, 'S');
		callnew(400);
		callnew(5.44, "automation testing", 'S');
		callnew("Java Testing", 4.44, 'D', 55);
	}

	static void callnew(int add, char demo) {

		System.out.println(add);
		System.out.println(demo);
	}

	static void callnew(double data, String s, char b) {
		System.out.println(data);
		System.out.println(s);
		System.out.println(b);
	}

	static void callnew(int add) {
		System.out.println(add);
	}

	static void callnew(String d, double k, char s, int bb) {
		System.out.println(d);
		System.out.println(k);
		System.out.println(s);
		System.out.println(bb);
	}
}
