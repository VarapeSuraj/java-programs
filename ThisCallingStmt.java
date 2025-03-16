package JavaNewProgram.JavaNewProgramDemo;

// Assignment 44 "WAP on this calling statement"

public class ThisCallingStmt {

	public ThisCallingStmt(String b) {
		System.out.println("This calling statement with string: " + b);
	}

	public ThisCallingStmt(int a) {
		this("Demo");
		System.out.println("This calling statement with integer value:" + a);
	}

	public ThisCallingStmt() {
		this(5);
	}
	
	public static void main(String[] args) {
		
		ThisCallingStmt newobj = new ThisCallingStmt();
	}

}
