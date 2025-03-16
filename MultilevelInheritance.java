package JavaNewProgram.JavaNewProgramDemo;

// Assignment 40 WAP on Multi Level Inheritance
class ml1{
	void m1() {
		System.out.println("super parent class");
	}
}
class ml2 extends ml1{
	void m2() {
		System.out.println("sub parent class 1");
	}
}
class ml3 extends ml2{
	void m3() {
		System.out.println("sb parent class 2");
	}
}
public class MultilevelInheritance extends ml3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance m = new MultilevelInheritance();
		m.m1();
		m.m2();
		m.m3();
		
	}

}
