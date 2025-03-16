package JavaNewProgram.JavaNewProgramDemo;
import java.util.*;
/*Assignment 90 WAP on While loop
Assignment 91 WAP to iterate a Collection using Iterator
Assignment 93 WAP to iterate a List using Iterator
Assignment 94 WAP to iterate a List using List iterator
Assignment 95 WAP on Set concepts using its methods 
Assignment 96 WAP to iterate a Set using Iterator*/

public class WhileLoopList {
	public static void main(String[] args) {
		Set se = new HashSet();
		se.add(12);
		se.add(2);
		se.add(22);
		System.out.println(se);
		
		Iterator li = se.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
