package JavaNewProgram.JavaNewProgramDemo;

public class ConditionalOperatorsIfElse {

	public static void main(String[] args) {
		
		int a = 400, b = 200, c = 500;
		if (a > b) {
			if (a >= c)
				System.out.println("The Greater Vaule between a,b & c is a = " + a);
			else
				System.out.println("The Greater Vaule between a,b & c is c = " + c);
		} else {
			if (b >= c)
				System.out.println("The Greater Vaule between a,b & c is b = " + b);
			else
				System.out.println("The Greater Vaule between a,b & c is c = " + c);
		}
		
		/*a = b;
		b = c;
		c = a;
		if(a == 20) {
			System.out.println("match found is 20");
		}	
		else if(a == 200) {
			System.out.println("match found is 200");
		}
		else if(a == 400) {
			System.out.println("match found is 400");
		}
		else {
			System.out.println("match not found");
		}*/
		
	}
	
	

}
