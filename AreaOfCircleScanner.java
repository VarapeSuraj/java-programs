package JavaNewProgram.JavaNewProgramDemo;

import java.util.Scanner;

public class AreaOfCircleScanner {

	public static void main(String[] args) {
		
		// Assignment 30 WAP to print Area of Circle using Scanner Class
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Value of PI: ");
		float pi = sc.nextFloat();
		
		System.out.println("Enter a Value of r: ");
		float r = sc.nextFloat();
	
		System.out.println("The Area of Circle is: " + pi*r*r);
		
		
	//	Assignment 31	WAP to print Circumference of Circle using Scanner Class
		
		// formula 2*pi*r

		System.out.println("Enter a Value of PI: ");
		float pii = sc.nextFloat();
		
		System.out.println("Enter a Value of r: ");
		float r1 = sc.nextFloat();
		
		System.out.println("Circumference of Circle is: " + 2*pii*r1);
	
		
		// Assignment 32 WAP to print Area of Triangle using Scanner Class	
		
		System.out.println("Enter a Value of Height: ");
		float Height = sc.nextFloat();
		
		System.out.println("Enter a Value of Base: ");
		float Base = sc.nextFloat();
		
		System.out.println("Area of Triangle is: " + 0.5*Height*Base);
		
		 
		// Assignment 33 WAP to print Circumference of Triangle using Scanner Class
		
		System.out.println("Enter a Value of LeftSide: ");
		float LeftSide = sc.nextFloat();
		
		System.out.println("Enter a Value of RightSide: ");
		float RightSide = sc.nextFloat();
		
		System.out.println("Enter a Value of Base: ");
		float Base1 = sc.nextFloat();
		
		System.out.println("Circumference of Triangle is: " + (LeftSide+RightSide+Base1));
		

		// Assignment 34	WAP to print Area of Square using Scanner Class
		
		System.out.println("Enter a Value of Area: ");
		float Area2 = sc.nextFloat();
		System.out.println("Area of Square is: " + (Area2*Area2));
		
		// Assignment 35	WAP to print Circumference of Square using Scanner Class
		
		System.out.println("Enter a Value of Area: ");
		float Area3 = sc.nextFloat();
		System.out.println("Circumference of Square is: " + (Area3*Area3));
				
		// Assignment 36	WAP to print Area of Rectangle using Scanner Class
		
		System.out.println("Enter a Value of Width: ");
		float Width = sc.nextFloat();
		System.out.println("Enter a Value of Length: ");
		float Length = sc.nextFloat();
		System.out.println("Area of Rectangle is: " + (Length*Width));	
		
		// Assignment 37 WAP to print Circumference of Rectangle using Scanner Class
		
		System.out.println("Enter a Value of PI: ");
		float Length4 = sc.nextFloat();
		System.out.println("Enter a Value of r: ");
		float Width4 = sc.nextFloat();
		System.out.println("Circumference of Rectangle is: " + (2 * (Length4 + Width4)));
		
	}

}
