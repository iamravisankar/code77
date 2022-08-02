package mugesh012;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterException {

	public static void main(String[] args) {
		// Use array list Iter Exception
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("mugesh");
		nameList.add("ramesh");
		nameList.add("ganesh");
		nameList.add("dinesh");
		nameList.add("suresh");
		Iterator<String> myList = nameList.iterator();
		try {
			while (myList.hasNext()) {
				System.out.println(myList.next());
				if (myList.next() == "dinesh") {
					myList.remove();
				}
				System.out.println(myList.next());
			} 
		} catch (Exception e) {
			System.out.println("unexpected error occur :" +e);
		}

	}

}
