package Manoj;

import java.util.ArrayList;
import java.util.Iterator;

public class It {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(11);
		numbers.add(20);
		numbers.add(9);
		numbers.add(1);
		
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (i < 20) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
