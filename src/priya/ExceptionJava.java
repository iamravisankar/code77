package priya;

public class ExceptionJava {

		  public static void main(String[] args) {
		    try {
		    	
		      String[] myNames = {"priya","diya","nila","sun"};
		      System.out.println(myNames[2]);
		      
		      int[] RegisterNum = {2390,2391,2392,2393};
		      System.out.println(RegisterNum[4]);
		      
		    } 
		    catch (Exception e) {
		      System.out.println("Something went wrong we can't find the it.");
		    } 
		    finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		  }
		}


