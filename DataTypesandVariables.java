package JavaNewProgram.JavaNewProgramDemo;

public class DataTypesandVariables {

	public static void main(String[] args) {
/*		Assignment 11, 12 & 13:
			WAP to call one non static method in the main method*/
		
		DataTypesandVariables obj = new DataTypesandVariables();
		obj.addition();
		obj.multiplication();
		obj.division();
		obj.substraction();
		demo();
	}
	static void demo() {
		System.out.println("This is statis menthod");
	}
	public void addition() {
		System.out.println("This is not static method of addition");
	}
	public void multiplication() {
		System.out.println("This is not static method of multiplication");
	}
	public void division() {
		System.out.println("This is not static method of division");
	}
	public void substraction() {
		System.out.println("This is not static method of substraction");
	}
}
