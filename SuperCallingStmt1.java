package JavaNewProgram.JavaNewProgramDemo;

/* Assignment 42 WAP on super calling statement using non-parameterized 
super calling statement */
class Supercallhere{
	void message() {
		System.out.println("This is a first class");
	}
}
class Supercallhere1 extends Supercallhere {
	void message() {
	System.out.println("This is sencond class");
	}
	void display() {
		message();
		super.message();
	}}
public class SuperCallingStmt1 {
	public static void main(String[] args) {
		Supercallhere1 ss = new Supercallhere1();
		ss.display();
	}
}
