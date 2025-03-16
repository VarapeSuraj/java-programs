package JavaNewProgram.JavaNewProgramDemo;
import java.lang.*;  
import java.util.*;  
/* Assignment 107	WAP to convert int into double using both implicitly and explicitly
Assignment 108	WAP to convert double into int
Assignment 109	WAP to convert double into float
Assignment 110	WAP to convert byte into int
Assignment 111	WAP to convert int into byte
Assignment 112	WAP to convert int into byte where int value is 10000
Assignment 113	WAP to convert short into byte
Assignment 114	WAP to convert short into int
Assignment 115	WAP to convert float into double */
								
public class ConvertDataypes {

	public static void main(String[] args) {
	
		int i = 10;
		double d = 2223;
		byte b = 110;
		short s = 33;
		float f = 33.45f;
		
		System.out.println("Implicitly declared :" + d);
		double d2 = ((double)2223);
		System.out.println("Explicitly Declared :" + d2);
		
        int value1 = (int)Math.round(d);
        System.out.println("convert double into int: "+value1);
        
        float f1 = (float)Math.round(d);  
        System.out.println("convert double into float: "+f1);
		
		byte b1 = (byte)Math.round(i);
		System.out.println("convert byte into int: "+b1);
		
		int a2 = 1000;
		byte b2 = (byte)Math.round(a2);
		System.out.println("convert byte into int: "+b2);
		
		short s2 = (byte)Math.round(s);
		System.out.println("convert Sort into byte: "+b2);
		
		short s3 = (short)Math.round(s);
	    System.out.println("convert short into int: "+s3);
	    
	    double d1 = (double)Math.round(f); 
	    System.out.println("convert float into double: "+ d1);

	}

}
