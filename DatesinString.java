package JavaNewProgram.JavaNewProgramDemo;
import java.util.*;
/*Assignment 85 WAP to find out the current date, past date and future 
date using String function*/
public class DatesinString {

	public static void main(String[] args) {

		Date d = new Date();
		String format1 = d.toString();
		System.out.println(format1);
		String month = format1.substring(4, 7);
		System.out.println(month);
		String year = format1.substring(format1.length()-4);
		System.out.println(year);
		String format2 = format1.concat(month).concat(year);
		System.out.println(format2);
		Date d2 = new Date(d.getDate() - (1000*60*60*24*1));
		System.out.println(d2);
	}

}
