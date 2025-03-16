package JavaNewProgram.JavaNewProgramDemo;

// Assignment 46 WAP on Super Keyword

class supercallclass{
	int a = 100;
}
class supercallclass2 extends supercallclass {
	int a =200;
	void calls() {
		System.out.println("The Value of a is : " + a);
		System.out.println("The Super Value of a is : " + super.a);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		supercallclass2 obj = new supercallclass2();
		obj.calls();
	}
}
