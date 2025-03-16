package JavaNewProgram.JavaNewProgramDemo;

// Assignment 39 WAP on Single Level Inheritance

class A1 {
	void a1() {
		System.out.println("first parent class");
	}
}

class B1 extends A1 {
	void b1() {
		System.out.println("second parent class");
	}
}

public class SingleLevelInheritance extends B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLevelInheritance S = new SingleLevelInheritance();
		S.b1();
		S.a1();
	}

}
