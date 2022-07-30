package priya;

public class OutputJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here we use all the java basic concepts ");
		System.out.println("Lets start all the concepts one by one\n");
		// Theme is the number boys and girls going a vacation for weekend
		System.out.println("In a company manager planned for an weekend with their boys and girls team.");
		System.out.println("Boys And Girls Have a team name:\n");
		int boys = 50;
		String BoysTeamName = "THE FOLKS";
		int girls = 45;
		String GirlsTeamName = "THE ROCKS";
		// Girls team change their team name
		GirlsTeamName = "SHE DEVILS ";// team name is now She devils
		//boys team name
		System.out.println("Boys team name = " + BoysTeamName);
		System.out.println("Total boys = " + boys + "\n");
		//girls team name
		System.out.println("Girls team name = " + GirlsTeamName);
		System.out.println("TotalGirls = " + girls +"\n");
		System.out.println("Total number of boys and girls = " + (boys + girls)+"\n");
		System.out.println("They went a theme park\n");
		String parkName = "BLACK THUNDER";
		System.out.println("Theme park name : " + parkName + "\n");
		int entryTicketAmount = 750;
		System.out.println("Per head entry ticket amount : Rs." + entryTicketAmount);
		System.out.println("Entry ticket total amount paid for all members : Rs." +(boys + girls)* entryTicketAmount + "/- \n");
		//theme park rules and regulations
		System.out.println("Rules in black thunder:");
		float weight = 60.5f;
		double kidsAge = 10;
		System.out.println("1. The average persons weight is allowed in Water games is " + weight +"Kg.");
		System.out.println("2. Mobiles are not allowed.");
		System.out.println("3. Kids allowed the age above " + kidsAge + ".\n");
		//Age for adults
		boolean isAgebelow60 = true;
		boolean isAgeabove60 = false;
		System.out.println("Age below 60 is allowed  : " + isAgebelow60);
		System.out.println("Age above 60 is not allowed : " + isAgeabove60 +"\n");
		System.out.println("In theme park they conduct a program ");
		long girlsScore = 20;
		byte boysScore = 19;
		System.out.println("Winning team got score " + girlsScore + ( girlsScore > boysScore )+ "\n"+"Team name :" + GirlsTeamName);
		
	}

}
