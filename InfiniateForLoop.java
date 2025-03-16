package JavaNewProgram.JavaNewProgramDemo;

public class InfiniateForLoop {

	public static void main(String[] args) {
		
/*		Assignment 28	WAP to print -10 to +10 using for loop
		Assignment 29	WAP to print -5 to -15 using for loop
 */	
		for(int i=-10;i<=10;i++)
		{
			System.out.println(i);
		}
		for(int j=-5;j>=-15;j--) {
			System.out.println(j);
		}
		
		// Assignment 26 "WAP for infinite loop"
		// Assignment 27 "WAP to run a for loop that does not start."
		
		
		for(int i=1;i>0;i++) 
		{
			System.out.println("indefinitely loop");
		}
		for(;;) 
		{
			System.out.println("For loop that does not start");
		}
	}

}
