package Manoj;

import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		LinkedList<String> birds = new LinkedList<String>();
		birds.add("Peacock");
		birds.add("Pegion");
		birds.add("Hen");
		birds.add("CockTail");
		birds.add("Rose-Ringed Parrot");

		birds.addFirst("Duck");
		System.out.println(birds);

		birds.addLast("Crow");
		System.out.println(birds);

		birds.removeFirst();
		System.out.println(birds);

		birds.removeLast();
		System.out.println(birds);

		System.out.println("Indian National bird " + birds.getFirst());

		System.out.println(birds.getLast() + " speaks 250 words");
	}
}
