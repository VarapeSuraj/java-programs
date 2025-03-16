package JavaNewProgram.JavaNewProgramDemo;

// Assignment 47 WAP on This Keyword
class thisclass{
	int a;
	public thisclass(int a) {
		this.a = a;
		}
	void demo() {
		System.out.println("The This keyword output is: " + a);
		}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisclass ts = new thisclass(5);
		ts.demo();
	}

}
