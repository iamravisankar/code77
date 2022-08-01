package sushmitha;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpr {
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pattern pattern = Pattern.compile("alagappa", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("Visit alagappa!");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
          }
         }
