package JavaNewProgram.JavaNewProgramDemo;
// Assignment 41 WAP on Hierarchical Level Inheritance
class H1{
	void h1() {
		System.out.println("calling h1");
	}
}
class H2 extends H1{
	void h2() {
		System.out.println("calling h2");
	}
}
class H3 extends H2{
	void h3() {
		System.out.println("calling h3");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H3 hh = new H3();
		hh.h3();
		hh.h2();
		System.out.println("***********");
		H2 hh2 = new H2();
		hh2.h1();
		hh2.h2();
	}

}
