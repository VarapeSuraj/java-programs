package JavaNewProgram.JavaNewProgramDemo;

class ExampleOfConstuctorOverloading {

	int a, b, sum;
	// "Assignment 19 WAP on Constructor Overloading"
	public ExampleOfConstuctorOverloading(int firstnumber, int secondnumber) {
		a = firstnumber;
		b = secondnumber;
		System.out.println("Its parameterized constructor with " + "addition of two number is = " + (sum = a + b));
	}

	public ExampleOfConstuctorOverloading() {
		System.out.println("Its a default with non parameterized constructor");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {

		ExampleOfConstuctorOverloading obj = new ExampleOfConstuctorOverloading(10, 20);
		ExampleOfConstuctorOverloading obj1 = new ExampleOfConstuctorOverloading();
	}
}
