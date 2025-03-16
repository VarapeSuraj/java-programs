package JavaNewProgram.JavaNewProgramDemo;

import java.util.InputMismatchException;

// Assignment 63 WAP on throws keyword concept
// Assignment 65 WAP to terminate any program using Throw keyword

public class ThrowKeyword {

	public static void main(String[] args) throws NullPointerException, InputMismatchException{
		if(1>3) {
			throw new NullPointerException();
		}else {
			throw new InputMismatchException();
		}
	}
}
