package Manoj;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
	public static void main(String args[]) {

		ArrayList<String> obj = new ArrayList<String>();

		obj.add("Manoj");
		obj.add("Karthik");
		obj.add("Ravi");
		obj.add("Mugesh");
		obj.add("Vijay");
		obj.add("Ajith");
		obj.add("Kamal");
		obj.add("Rajini");

		System.out.println("Mechanical-A Name List :");

		for (int list = 0; list < obj.size(); list++) {
			System.out.println(obj.get(list));

		}

		obj.add(8, "Vivek");
		obj.add(9, "Pothi");

		System.out.println("Adding Names :");
		for (String list : obj)
			System.out.println(list);
		System.out.println("\n");

		obj.remove(7);

		System.out.println("Remove index 7 :");
		for (String list : obj)
			System.out.println(list);
		System.out.println("\n");

		Collections.sort(obj);
		System.out.println("Order List :");
		for (String list : obj) {
			System.out.println(list);

		}
	}

}
