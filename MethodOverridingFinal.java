package JavaNewProgram.JavaNewProgramDemo;

// Assignment 48 WAP to avoid Method Overiding using Final Method

class Democallss {
	int a = 100;
	void printline() {
		System.out.println("The final method overriding" + a);
	}
}
class Democallss2 extends Democallss{
	int b = 200;
	 void printline() {
		System.out.println("The final method overriding" + a);
	}
}

public class MethodOverridingFinal {

	public static void main(String[] args) {
		Democallss2 ss1 = new Democallss2();
		ss1.printline();
	}

}
