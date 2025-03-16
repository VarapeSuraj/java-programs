package JavaNewProgram.JavaNewProgramDemo;

import java.util.*;

/*Assignment 89 WAP on collection concept with the help of Upcasting on Different 
Data types (Int, Char, Double, string etc.) with different methods like Add, 
Remove, Contains.
Assignment 92 WAP on List concepts using its methods 
Assignment 97 WAP to sort List*/

public class Upcasting {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(12);
		l1.add('A');
		l1.add("Suraj");
		l1.add(12.12);
		l1.add(true);
		l1.add(null);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.contains('A');

		System.out.println(l1);

		List<String> l2 = new ArrayList<String>();
		l2.add("java");
		l2.add("List");
		
		Collections.sort(l2); 	// sorting array list using collection
		System.out.println(l2);
		
	}

}
