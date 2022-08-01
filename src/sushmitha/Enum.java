package sushmitha;
enum result {
	  day,
	  month,
	  year
	  }

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result myvar = result.day;
		switch(myvar) {
	      case day:
	        System.out.println("happiest day");
	        break;
	      case month:
	         System.out.println("october month");
	        break;
	      case year:
	        System.out.println("special year");
	        break;
		}

	}

}
