package sushmitha;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpr2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		List < String > names = new ArrayList < String > ();
        names.add("sai");
        names.add("Sai123");
        names.add("!");
        String regex = "^[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        for (String name: names) {
            Matcher matcher = pattern.matcher(name);
            System.out.println(matcher.matches());
         }

	}

}
