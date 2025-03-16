package JavaNewProgram.JavaNewProgramDemo;
// Assignment 45 WAP on method overriding
class FirstMethodOverrrid1{
	void a1() {
		System.out.println("First Demo");}
	void a2() {
		System.out.println("Second Demo");
	}}
class FirstMethodOverrrid2 extends FirstMethodOverrrid1{
	void a1() {
		System.out.println("Third Demo");}
	void a2() {
		System.out.println("Fourth Demo");
	}}
public class MethodOverridingConcept {
	public static void main(String[] args) {
		FirstMethodOverrrid1 fm1 = new FirstMethodOverrrid1();
		fm1.a1();
		FirstMethodOverrrid2 fm2 = new FirstMethodOverrrid2();
		fm2.a1();
	}

}
