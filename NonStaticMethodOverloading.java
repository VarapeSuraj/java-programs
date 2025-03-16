package JavaNewProgram.JavaNewProgramDemo;

public class NonStaticMethodOverloading {

	public static void main(String[] args) {

		/*
		 * "Assignment 15 WAP with combination of 3 static parameterized methods and try
		 * calling try calling them inside main method"
		 */
		NonStaticMethodOverloading objectnew = new NonStaticMethodOverloading();
		objectnew.callnew(50, 'S');
		objectnew.callnew(400);
		objectnew.callnew(5.44, "automation testing", 'S');
		objectnew.callnew("Java Testing", 4.44, 'D', 55);
	}

	void callnew(int add, char demo) {

		System.out.println(add);
		System.out.println(demo);
	}

	void callnew(double data, String s, char b) {
		System.out.println(data);
		System.out.println(s);
		System.out.println(b);
	}

	void callnew(int add) {
		System.out.println(add);
	}

	void callnew(String d, double k, char s, int bb) {
		System.out.println(d);
		System.out.println(k);
		System.out.println(s);
		System.out.println(bb);
	}
}
