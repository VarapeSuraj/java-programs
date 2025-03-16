package JavaNewProgram.JavaNewProgramDemo;

import java.util.*;

/*Assignment 98 WAP to store account number, account holder name inside 
Map by passing the values at runtime for both account number, account 
holder
Assignment 99 WAP on MAP concepts using its methods */
public class MapProgram {

	public static void main(String[] args) {
		
		Map mp = new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Account Number: ");
		int account_number = sc.nextInt();
		
		System.out.println("Enter a Account Holder Name: ");
		String Account_holder_name = sc.next();
		mp.put(account_number, Account_holder_name);
		System.out.println(mp);
	}

}
