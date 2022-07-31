package mugesh012;
import java.time.*;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class AgaCalc {
	static int calcAge() {
		Scanner EnterUrDateBirth = new Scanner(System.in);
		System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
		String UrDoB = EnterUrDateBirth.nextLine();
		LocalDate Dob;
		Dob = LocalDate.parse(UrDoB);
		LocalDate currentDate = LocalDate.now();
		int age = Period.between(Dob, currentDate).getYears();
		return age;
	}

	static String findDay() throws ParseException {
		System.out.println("date format dd-MM-yyyy ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEEE");
		Date d = sdf.parse(s1);
		String s = sdf1.format(d);
		return s.toUpperCase();
	}
	static void findYear() {
		Scanner EnterUrAge = new Scanner(System.in);
		System.out.println("Please enter your age ");
		int UrAge = EnterUrAge.nextInt();
		Calendar calender = Calendar.getInstance();
		 calender.add(Calendar.YEAR, -UrAge);
		System.out.println(calender.getTime());
	
		
	}

	public static void main(String[] args) throws ParseException {
		Scanner myScan = new Scanner(System.in);
		int userCheck=1;
		while( userCheck == 1) {
			System.out.println("enter 1 for App or exit 2 ");
			userCheck = myScan.nextInt();
			if (userCheck == 1) { 
	    System.out.println("Enter the your choices");	   
		System.out.println("Enter 1 calculate your age");
		System.out.println("Enter 2 calculate your birthday");
		System.out.println("Enter 3 find your bith year");
		 int myOperator = myScan.nextInt();
		switch (myOperator) {
		case 1:
	System.out.println("You are birth day" + findDay());
	break;	
		case 2:
	System.out.println("You are age is : "+calcAge());
	break;
		case 3:
	findYear();
	break;
		}
	} else {
		System.out.println("thank for visiting");
	}
}
	}
	

}
