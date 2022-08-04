package priya;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpJava {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("n+n?[0-9][abc]");
		Matcher matcher = pattern.matcher("nn0n[6][a]");
		boolean matchFound = matcher.find();
		
		Pattern pattern1 = Pattern.compile("P@123FR",Pattern.CASE_INSENSITIVE);
		Matcher matcher1= pattern1.matcher("Visit p@123FR");
		boolean matchFound1 = matcher1.find();
		
		if (matchFound) {
			System.out.println("Match found");
			
		} else if (matchFound1){
			System.out.println("Match is found ");
			
		}else {
			System.out.println("Match not found");
		}
	}

}
