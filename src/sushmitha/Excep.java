package sushmitha;

public class Excep {
	static void checkAge(int age) { 
	    if (age < 15) {
	      throw new ArithmeticException("you are not growing up"); 
	    } else {
	      System.out.println("You are growing faster"); 
	    }
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int[] myNumbers = {1, 2, 3,4,5,6};
		      System.out.println(myNumbers[5]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		 checkAge(15); 

	}

}
