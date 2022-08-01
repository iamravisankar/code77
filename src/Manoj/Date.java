package Manoj;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Date {
	public static void main(String[] args) {

		DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Date and Time Format: " + now + "\n");

		System.out.println("Today's Date: " + java.time.LocalDate.now() + "\n");
		System.out.println("Current Time is: " + java.time.LocalTime.now() + "\n");
		// System.out.println(java.time.LocalDateTime.now());
		java.util.Date date = new java.util.Date();
		System.out.println("Indian Standard Time: " + date + "\n");

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime().toString());
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day: " + day);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hour: " + hour);
		int minute = calendar.get(Calendar.MINUTE);
		System.out.println("Minute: " + minute);

	}
}
