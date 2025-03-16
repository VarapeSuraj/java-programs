package JavaNewProgram.JavaNewProgramDemo;
/*Assignment 86 & 87 WAP on String Buffer using Append, insert, delete, substring,
reverse, Capacity, replace
Assignment 88 WAP on constructors of a String Buffer and constructors of a String Builder
*/
public class StringBuilderPgm {
	StringBuilderPgm(){
		super();
		System.out.println("Constuctor of StringBuilder");
	}
	public static void main(String[] args) {
		
		StringBuilderPgm sbd = new StringBuilderPgm();
		StringBuilder sb = new StringBuilder("Java ");
		sb.append("Programming");
		sb.insert(2, 3);
		System.out.println(sb);
		sb.delete(4, 7);
		System.out.println(sb);
		sb.substring(5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.capacity();
		System.out.println(sb);
		sb.replace(6, 6, "dd");
		System.out.println(sb);
		
	}
	
}

