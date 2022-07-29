package mugesh012;

import java.util.ArrayList;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mark = new ArrayList<Integer>();
		mark.add(45);
		mark.add(78);
		mark.add(56);
		mark.add(95);
		mark.add(50);
		System.out.println(mark);
		// get value
		System.out.println(mark.get(3));
		// set value or replace value
		System.out.println(mark.set(0, 34));
		System.out.println(mark);
		// remove the value
		System.out.println(mark.remove(2));
		System.out.println(mark);
		// array size
		System.out.println(mark.size());
		System.out.println("list normal for loop");
		for (int i = 0; i < mark.size(); i++) {
			System.out.println(mark.get(i));
		}
		System.out.println("list normal forEach loop");
		for (Integer markSheet : mark) {
			System.out.println(markSheet);
		}
		// clear array list
		mark.clear();
		System.out.println(mark);
		//

	}

}
