package mugesh012;

import java.util.LinkedList;
import java.util.*;
import java.util.Iterator;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myNumber = new LinkedList<Integer>();
		myNumber.add(12);
		myNumber.add(14);
		myNumber.add(16);
		myNumber.add(18);
		myNumber.add(20);
		myNumber.add(22);
		System.out.println(myNumber);
		// remove method in linkedlist
		myNumber.removeFirst();
		myNumber.removeLast();
		// add method in linkedlist
		myNumber.addFirst(50);
		myNumber.addLast(100);
		// get method
		System.out.println(myNumber.getFirst());
		System.out.println(myNumber.getLast());
		// print linkedlist
		System.out.println(myNumber);
		// using iteretor
		Iterator<Integer> myIt = myNumber.iterator();
		System.out.println(myIt.next());  // 1st iterator
		System.out.println(myIt.next());  // 2st iterator
		System.out.println(myIt.next());  // 3st iterator	

	}

}
