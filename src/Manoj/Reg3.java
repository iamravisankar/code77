package Manoj;

import java.util.regex.*;

public class Reg3 {

	public static void main(String[] args) {

		String REGEX = "welcome";

		String actualString = "welstudentscomewel";

		Pattern pattern = Pattern.compile(REGEX);

		Matcher matcher = pattern.matcher(actualString);

		boolean matchfound = false;
		while (matcher.find()) {
			System.out.println("match found");
			matchfound = true;
		}
		if (!matchfound) {
			System.out.println("No match found");
		}
	}
}
