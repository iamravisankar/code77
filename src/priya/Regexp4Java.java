package priya;

import java.util.regex.*;

public class Regexp4Java {

	public static void main(String args[]){  
	System.out.println("metacharacters d....");//d means digit
	  
	System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
	System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
	System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
	System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
	  
	System.out.println("metacharacters D....");//D means non-digit  
	  
	System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
	System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
	System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
	System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
	System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
	  
	System.out.println("metacharacters D with quantifier....");  
	System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
	  
	/*Create a regular expression that accepts alphanumeric characters only.  
	Its length must be six characters long only.*/  
	
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
	}
}

