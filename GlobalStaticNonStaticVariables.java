package JavaNewProgram.JavaNewProgramDemo;

public class GlobalStaticNonStaticVariables {
	
	long a = 10l;
	static String s = "suraj";
	final static int a1 =100;
	
	public static void main(String args[]) {
		
	/*	Assignment 20 WAP on Final Variable
	 * 
	 * Assignment 21 WAP for static and non static global varibles and utilize them in 
		both static and non static methods 
		
		Assignment 22 WAP to update static and non static global variable
		*/
		
		System.out.println(a1);
		
		staticmethoad();
		
		GlobalStaticNonStaticVariables obj = new GlobalStaticNonStaticVariables();
		obj.nonstaticmethoad();
	}
	
	static void staticmethoad() {
		
		System.out.println("Calling here the static method " + s);
		
		s = "updating the satic variable";
		
		System.out.println("Calling here the updated static method " + s);
	}
	
	void nonstaticmethoad() {
		System.out.println("Calling here the non static method " + a);
		
		a = 5;
		System.out.println(a);
	}
}
