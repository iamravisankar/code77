package Manoj;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String args[]) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("Gova");
		fruit.add("Orange");

		System.out.println("Returning element: " + fruit.get(1) + " and " + fruit.get(2));

		fruit.set(1, "Strawberry");
		fruit.set(2, "Grapes");

		for (String fruits : fruit)
			System.out.println(fruits);

	}
}
