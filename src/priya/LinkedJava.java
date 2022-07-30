package priya;

import java.util.LinkedList;

public class LinkedJava {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Taxi");
		cars.add("Ambassdor");
		cars.add("Ford");
		cars.add("Van");
		cars.addFirst("Bolero");
		System.out.println(cars);
		System.out.println("Adding first:" + cars.getFirst());
		cars.addLast("Nano");
		System.out.println(cars);
		System.out.println(cars.getLast());
		cars.removeFirst();
		System.out.println(cars);
		cars.removeLast();
		System.out.println(cars);

	}
}
