package Manoj;

import java.util.HashMap;

public class HM {
	public static void main(String[] args) {

		HashMap<String, Integer> pass = new HashMap<String, Integer>(), fail = new HashMap<String, Integer>(),
				Justpass = new HashMap<String, Integer>();
		pass.put("Ramesh", 45);
		Justpass.put("Suresh", 36);
		fail.put("Rajesh", 10);
		pass.put("Babu", 67);
		fail.put("Gobu", 15);
		fail.put("Kumaresh", 26);

		System.out.println("Students got pass: " + pass);

		System.out.println("Students got failed: " + fail);

		System.out.println("Students got just pass: " + Justpass);

	}
}
