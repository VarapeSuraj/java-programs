package JavaNewProgram.JavaNewProgramDemo;
/*Assignment 116 WAP on Class Typecasting to achive Upcasting(in implicit 
		and explicit way) and Downcasting*/

class Upcasting1ParentClass{
	String name;
	void demo() {
		System.out.println("Parent Class Calling");
	}
}

class Downcasting2ObjectClass extends Upcasting1ParentClass{
	int id;
	void demo2() {
		System.out.println("Object class calling");
	}
}

public class UpCastingandDowncating {

	public static void main(String[] args) {
		
		 // Upcasting
		Upcasting1ParentClass ab = new Downcasting2ObjectClass();
		ab.name = "Upcasting and downcasting demo";
		System.out.println(ab.name);
		ab.demo();
		
		// Downcasting Explicitly manner
		Downcasting2ObjectClass d1 = (Downcasting2ObjectClass)ab;
		d1.id = 23;
		d1.name = "Demo downacasting";
		System.out.println(d1.id);
		System.out.println(d1.name);
		d1.demo2();
		
	}
		
}

