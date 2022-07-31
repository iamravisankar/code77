package Manoj;

import java.util.HashSet;

public class Hset {
	public static void main(String[] args) {

		HashSet<String> names = new HashSet<String>();

		names.add("Manoj");
		names.add("Karthik");
		names.add("Karthick");
		names.add("Karthik");
		names.add("ManojKarthik");
		System.out.println("Num of size " + names.size());
		names.remove("Karthick");
		names.remove("Karthik");
		names.remove("Manoj");
		for (String i : names) {
			System.out.println("Real name is "+ i);

		}
		names.clear();
		System.out.println(names);
	}
}
