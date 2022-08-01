package mugesh012;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExprsn {
	 public static void main(String[] args) 
	 {
	  Pattern pattern = Pattern.compile("Mugesh|Dinesh");
	  Matcher matcher = pattern.matcher("Generally, Mugesh and Dinesh share a great bonding.");
	   
	  while (matcher.find()) {
	            System.out.print("Start index: " + matcher.start());
	            System.out.print(" End index: " + matcher.end() + " ");
	            System.out.println(" - " + matcher.group());
	        }
	 }
}
