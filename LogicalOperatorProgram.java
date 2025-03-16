package JavaNewProgram.JavaNewProgramDemo;

public class LogicalOperatorProgram {

	public static void main(String[] args) {
		
		// Assignment 9: WAP on logical operators with AND, OR, AND-NOT and Or-not
		
		int a = 10, b = 20;
		if(a >= 10 && b <= 20) {	// AND Condition
			System.out.println("enter into if A block");
		}
		if(a >= 10 || b < 20) {		// OR Condition
			System.out.println("enter into if B block");
		}
		if(!(a > 10 || b < 20)) {	// NOT AND Condition
			System.out.println("enter into if C block");
		}
		if(!(a > 10 && b < 20)) {	// NOT OR Condition
			System.out.println("enter into if D block");
		}
	}

}
