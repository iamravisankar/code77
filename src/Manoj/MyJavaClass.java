package Manoj;

public class MyJavaClass {

	static String classTest (String name1)
	{
		return name1;
	}
	
	
	static int classTest (int tamil, int english, int maths, int science, int social)
	{
		int total = tamil + english + maths + science + social;
		int avg = total / 5;
		System.out.println("percentage = " + avg);
		
		if (avg >= 35) {
			System.out.println("you are pass");
		}
		else {
			System.out.println("you are fail");
		}
	  return tamil + english + maths + science + social;
		
	}
	
	static int classTest (int tamil, int english, int maths, int biology, int physics, int chemistry)
	{
		int total = tamil + english + maths + biology + physics + chemistry;
		int avg = total / 6;
		System.out.println("percentage = " + avg);
		
		if (avg >= 35) {
			System.out.println("you are pass");
		}
		else {
			System.out.println("you are fail");
		}
		return tamil + english + maths + biology + physics + chemistry;
	}
    public static void main(String[] args) {
		
    	String name1 = classTest ("Manoj");
    	System.out.println(name1 + " studying 10th");
    	int mark1 = classTest (90, 85, 75, 98, 100);
    	System.out.println("Total mark = " + mark1 + "." + "\n");
    	
    	String name2 = classTest ("Karthik");
    	System.out.println(name2 + " studying 12th");
    	int mark2 = classTest (90, 85, 75, 98, 100, 99);
    	System.out.println("Total mark = " + mark2 + "." + "\n");
	}

}
