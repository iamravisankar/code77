package Manoj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regar {

	 static String REGEX = "dog";
	 static String INPUT = "The dog says meow. " + "All dogs say meow.";
	 static String REPLACE = "cat";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}

}
