package priya;

import java.util.HashMap;

public class HashJava {
	public static void main(String[] args) {
		HashMap<String, Integer> StudentMarkList = new HashMap<String, Integer>();
		StudentMarkList.put("Divya", 98);
		StudentMarkList.put("Aiswarya", 80);
		StudentMarkList.put("Priya", 93);
		StudentMarkList.put("Maha", 100);
		StudentMarkList.put("Siyamala", 95);
		StudentMarkList.put("Tharani", 91);
		for (String i : StudentMarkList.keySet()) {
			System.out.println("Students: " + i + " Mark: " + StudentMarkList.get(i));
		}
	}

}
