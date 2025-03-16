package JavaNewProgram.JavaNewProgramDemo;

public class MethodOverloading {

	public static void main(String[] args) {

		// Assignment 16 WAP for Method overloading for static and non static method.
		newmethod();
		MethodOverloading newdemo = new MethodOverloading();
		newdemo.newmethod(50);
	}

	static void newmethod() {
		System.out.println("demo calling");
	}

	void newmethod(int demo) {

		System.out.println(demo);
	}
}
