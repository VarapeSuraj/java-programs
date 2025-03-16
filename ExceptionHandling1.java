package JavaNewProgram.JavaNewProgramDemo;
// Assignment 61 WAP on Exception handling 
// Assignment 62 WAP on Exception handling using nested try catch keywords
// Assignment 67 Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts
// Assignment 68 Wap on String Function using concat and contains concept
public class ExceptionHandling1 {

	public static void main(String[] args) {
		int a = 0, b = 1,c,e;
		
		try {
		int[] ss = {1,2,3,5,6};
		c = b/a;
		System.out.println((ss[7]) + (c));
	
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException aexcep) {
			System.out.println("We handled airthmatic Exception Handling");
			System.out.println("We handled Array Index Out Of Bounds Exception Handling");	
		}
		
		String n = "suraj";
		String nn = "SURAJ";
		String d = " at trim function ";
		System.out.println(n.toUpperCase());
		System.out.println(nn.toLowerCase());
		System.out.println(n.length());
		System.out.println(n.charAt(3));
		System.out.println(d.trim());
		System.out.println(d.concat(d));
	}
}
