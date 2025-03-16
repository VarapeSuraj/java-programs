package JavaNewProgram.JavaNewProgramDemo;

import java.util.*;

/* Assignment 101 WAP on MAP using methods like get(), containsKey(), 
containsValue(), putIfAbsent(), equals()
Assignment 102 WAP to fetch all the keys present in map 
Assignment 103 WAP to fetch all the values present in map
Assignment 104 WAP to fetch both keys&values present in map 
Assignment 105 WAP to iterate a MAP using Iterator */
public class MapAllMethods {

	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(2,"java");
		mp.put(3,"automation");
		mp.put(4,"selenium");
		mp.put(5,"class");
		mp.put(6,"MKT");
		System.out.println(mp);
		System.out.println("Value is " + mp.get(2));
		Map<String,Integer> mp1 = new HashMap<String,Integer>();
		mp1.put("MKT",1);
		System.out.println("Contains String is " + mp1.containsKey("MKT"));
		System.out.println("Insert elemnet if missing :" + mp1.putIfAbsent("Demo", 3));
		System.out.println(mp1);
		System.out.println("Contains Value is :" + mp1.containsValue(1));
		System.out.println("Equals are :" + mp.equals(mp1));
		
		for (Map.Entry<String,Integer> itr : mp1.entrySet())
		{
			System.out.println("Key = " + itr.getKey() + ": Value = " + itr.getValue());
			}
	}

}
