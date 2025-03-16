package JavaNewProgram.JavaNewProgramDemo;

public class CheckVoteProgram {

	public static void main(String[] args) {
	/*	 Assignment 10 
        WAP to check person can vote only if he/she is 18 or 
        above and should not vote if age is less.*/
		
		int age = 18;
		int he = 22, she = 17;
		
		if(he == age || he > age) {
			System.out.println("He will be able to Vote = " + he);
	
		}else 
			System.out.println("He will not be not able to Vote as He is less than 18");
		
		
		if(she == age || she > age) {
			System.out.println("She will be able to Vote");
			System.out.println(she);
		}else 
			System.out.println("She will not be able to Vote as He is less than 18");
	}

}
