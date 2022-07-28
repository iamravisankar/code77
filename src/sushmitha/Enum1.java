package sushmitha;
import java.util.Scanner;

enum Day {
	    SUNDAY,
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY;
	}

public class Enum1 {
	Day day;
	 
	   
    public Enum1(Day day) { this.day = day; }
    public void dayIsLike()
    {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad");
            break;
        case FRIDAY:
            System.out.println("Fridays are better");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best");
            break;
        default:
            System.out.println("Midweek days are");
            break;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        String str = "MONDAY";
	        Enum1 myObj= new Enum1(Day.valueOf(str));
	        myObj.dayIsLike();
	    }
		    }

	}


