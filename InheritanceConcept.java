package JavaNewProgram.JavaNewProgramDemo;

	// Assignment 38 WAP on Inheritance Concept

class A {
	
	void demo3() {
		System.out.println("This is 1st method in Parent class");	
	}
	void demo4() {
		System.out.println("This is 2nd method in Parent class");
	}
}

public class InheritanceConcept extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceConcept I1 = new InheritanceConcept();
		I1.demo3();
		I1.demo4();
	}

}
