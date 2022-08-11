package sushmitha;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

        public class Regexpr4 {
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List < String > users = Arrays.asList("sai", "swetha", "mithra",
		            "shalini", "suriya", "raji");
         Pattern p = Pattern.compile("sai|swetha|raji|shalini");
		  for (String user: users) {
          Matcher m = p.matcher(user);
          if (m.matches()) {
		      System.out.printf("%s -> matches%n", user);
		          } else {
		      System.out.printf("%s -> does not match%n", user);
		            }
		        }


	}

}
