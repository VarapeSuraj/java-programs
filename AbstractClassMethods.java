package JavaNewProgram.JavaNewProgramDemo;
//Assignment 49 WAP on Abstract Class and Abstract Method
//Assignment 50 WAP on Abstract Class with both Abstract and Concrete methods

abstract class abmethod {
	abstract void a1();
	abstract void b1();
	void a2() {
		System.out.println("this is not abstract method calling");
	}
}
public class AbstractClassMethods extends abmethod implements InterfaceAbstractMethod{
	
	public static void main(String[] args) {
		AbstractClassMethods a1 = new AbstractClassMethods();
		a1.a2();
		a1.a22();
		a1.a33();
		a1.s11();
		a1.s122();
	}
	@Override
	void a1() {		
	}
	@Override
	void b1() {		
	}
	public void a22() {
		System.out.println("Calling here Interface 1");
	}
	public void a33() {
		System.out.println("Calling here Interface 2");	
	}
	public void s11() {
		System.out.println("Calling here Interface 3");		
	}
	public void s122() {
		System.out.println("Calling here Interface 4");
	}

}
