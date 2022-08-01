package priya;

import java.util.regex.*;

public class RegExpJava {

	public static void main(String[] args) {

		System.out.println(Pattern.matches(".s", "as"));   //  true (2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));   //  false (2nd char is not s)
		System.out.println(Pattern.matches(".s", "mso"));  //  false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "amms")); //  false (has more than 2 char)
		System.out.println(Pattern.matches("..s", "mas")); //  true (3rd char is s)
		System.out.println(Pattern.matches("..a", "maa")); //  true (3rd char is a)
		
	}

}
