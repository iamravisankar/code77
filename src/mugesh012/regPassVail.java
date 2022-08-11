package mugesh012;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regPassVail {
	
    
    public static boolean isValid() {
       	final String PASSWORD_PATTERN =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

        final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        System.out.println("enter you are password");
        Scanner password1 = new Scanner(System.in);
        String myPass = password1.nextLine();
        Matcher matcher = pattern.matcher(myPass);
        return matcher.matches();
    }
    public static void main(String[] args) {
    	// digit + lowercase char + uppercase char + punctuation + symbol 
    	regPassVail myKey = new regPassVail();
        System.out.println(myKey.isValid());
	}
}
