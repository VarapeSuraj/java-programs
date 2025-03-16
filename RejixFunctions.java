package JavaNewProgram.JavaNewProgramDemo;

public class RejixFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="allan";
		boolean b1=	a.matches(".....");
		System.out.println(b1);
		//String end with n
		boolean b2=		a.matches("(.)*n");//(.)* represenst multi char
			System.out.println(b2);
		//starting with a or not	
			boolean b3=		a.matches("a(.)*");//(.)* represenst multi char
			System.out.println(b3);
		//check if the given string have man in it
			
			String b="salman";
			boolean b4=		b.matches("(.)*man(.)*");
			System.out.println(b4);
	}

}
