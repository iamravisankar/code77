package priya;

import java.util.Scanner;

public class JavaArrays {
	static String myMethod (String name1)
	  {
	    return name1;
	  }
	  static String getname ()
	  {
	    System.out.println ("Enter the student name : ");
	    Scanner input = new Scanner (System.in);
	    String name = input.nextLine ();
	    return name;
	  }
	  static int myMethod (int tamil, int english, int maths, int biology,
			       int physics, int chemistry)
	  {
	    return tamil + english + maths + biology + physics + chemistry;
	  }
	  static int getmark12th ()
	  {
	    System.out.println ("Enter  12th  Mark : ");
	    Scanner input = new Scanner (System.in);
	    int tamil = input.nextInt ();
	    int english = input.nextInt ();
	    int maths = input.nextInt ();
	    int biology = input.nextInt ();
	    int physics = input.nextInt ();
	    int chemistry = input.nextInt ();
	    int total = tamil + english + maths + biology + physics + chemistry;

	    int avg = total / 6;

	    if (avg >= 35)
	      {
		System.out.println ("you are  pass");
	      }
	    else
	      {
		System.out.println ("you are fail");
	      }
	    System.out.println ("Total mark = " + total + ".");
	    System.out.println ("percentage = " + avg + "." + "\n");

	    return avg;
	  }

	  public static void main (String[]args)
	  {
	    String name1 = getname ();
	    System.out.println (name1 + " Studying 12th . ");
	    int mark12th = getmark12th ();

	    String[]names =
	    {
	    "priya", "susmi", "divya", "jene", "hidi"};

	    int[][] marks = { {1, 560}, {2, 570}, {3, 580}, {4, 600}, {5, 591} };
	    for (int i = 0; i < marks.length; i++)
	      {
		if (marks[i][1] == 600)
		  {
		    System.out.println (names[i] + " secured first mark ");
		   
		  }
		else if (marks[i][1] >= 591)
		  {
		    System.out.println (names[i] + " secured second mark " + "\n");

		  }
		else
		  {
		    System.out.println (names[i] + " secured third mark ");
		  }
	      }
	       System.out.println ("prize amount for first mark student rs.5000 : ");
	    Scanner input = new Scanner (System.in);
	    System.out.println ("Enter Your Name To Know Your deposit detail : ");
	    String name = input.nextLine ();
	    int p, n, r, sinterest;
	    System.out.println ("Enter Your principal : ");
	    p = input.nextInt ();
	    System.out.println ("Enter Your rate of interest : ");
	    n = input.nextInt ();
	    System.out.println ("Enter the time period : ");
	    r = input.nextInt ();
	    sinterest = p * n * r / 100;
	    System.out.println ("Simple Inerest : " + sinterest);
	    int years = 3;
	    switch (years)
	      {
	      case 1:
		System.out.println ("2022");
		break;
	      case 2:
		System.out.println ("2023");
		break;
	      case 3:
		System.out.println ("2024");
		break;
	      case 4:
		System.out.println ("2025");
		break;
       
	      }
	    System.out.println("Total amount "+ (p + sinterest) );

	  }
	}

	