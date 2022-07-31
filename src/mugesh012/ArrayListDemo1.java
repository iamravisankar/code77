package mugesh012;
import java.util.ArrayList;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// w3school learn 
		ArrayList<String> names = new ArrayList<String>();
		// add value
		names.add("mugesh");
		names.add("ramesh");
		names.add("suresh");
		names.add("dinesh");
		names.add("pugal");
		System.out.println(names);
		// get value 
		System.out.println(names.get(3));
		// set value or replace value
		System.out.println(names.set(0,"ajith"));
		System.out.println(names);
		// remove the value
		System.out.println(names.remove(2));
		System.out.println(names);
		// array size
		System.out.println(names.size());
		System.out.println("list normal for loop");
		for(int i =0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("list normal forEach loop");
		for(String nameList : names) {
			System.out.println(nameList);
		}		
		//clear array list
		names.clear();
		System.out.println(names);
		// 
	}
}
