package JavaNewProgram.JavaNewProgramDemo;
// Assignment 53 WAP on Multiple Level Inheritance
interface GrandParent{
	void grandfather();
}
interface Parent{
	void Parent();
}
interface Child{
	void child();
}
public class MultipleInheritance implements GrandParent,Parent,Child {

	public static void main(String[] args) {
		MultipleInheritance m1 = new MultipleInheritance();
		m1.child();
		m1.Parent();
		m1.grandfather();
	}

	public void child() {
		System.out.println("child class");
	}

	public void Parent() {
		System.out.println("papa class");
	}

	public void grandfather() {
		System.out.println("grandfather class");
	}
}
