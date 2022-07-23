package Manoj;

import java.util.Scanner;

public class ShowRoomVisit extends ShowRoomVisit2 {

	static String firstShow = "First I visit Maruti Showroom:";

	public static void main(String[] args) {

		String name;
		String entry = "welcome";
		System.out.println("Today is my special day, I want to buy a New Car. \n");

		System.out.println(firstShow);

		Scanner maruti = new Scanner(System.in);
		String welcome = maruti.nextLine();
		System.out.println(welcome + " : Welcome you sir!  take your seat");
		String waiter = maruti.nextLine();
		System.out.println(waiter + " : Have a Tea sir");
		String sales = maruti.nextLine();
		System.out.println(sales + " : what is budget sir?");
		String manoj = maruti.nextLine();
		System.out.println(manoj + " : my budget is 10lakhs sir! ");
		String sales1 = maruti.nextLine();
		System.out.println(sales1 + " : okay sir, In your budget they are 3cars available sir");
		String[] ms = { "*Maruti Suzuki", "*Maruti Ertiga", "*Maruti Breeza" };
		for (String i : ms) {
			System.out.println(i);
		}
		String manoj1 = maruti.nextLine();
		System.out.println(manoj1 + " : so, Tell me the price and specification of these cars?");
		String model = maruti.nextLine();

		if (model.contentEquals("Swift")) {

			System.out.println(model + ": Price-9Lakhs\nAcceleration (0-100 kmph)" + "11.35 seconds\r\n" + "\r\n"
					+ "Engine\r\n" + "1197 cc, 4 Cylinders Inline, 4 Valves/Cylinder, DOHC\r\n" + "\r\n"
					+ "Engine Type\r\n" + "1.2L Dual Jet\r\n" + "\r\n" + "\r\n" + "Engine Shot Image\r\n"
					+ "Fuel Type\r\n" + "Petrol\r\n" + "\r\n" + "Max Power (bhp@rpm)\r\n" + "89 bhp @ 6000 rpm\r\n"
					+ "\r\n" + "\r\n" + "Max Torque (Nm@rpm)\r\n" + "113 Nm @ 4400 rpm\r\n" + "\r\n" + "\r\n"
					+ "Mileage (ARAI)\r\n" + "23.2 kmpl\r\n" + "\r\n" + "\r\n" + "Driving Range\r\n" + "858 Km\r\n"
					+ "\r\n" + "Drivetrain\r\n" + "FWD\r\n" + "\r\n" + "\r\n" + "Transmission\r\n"
					+ "Manual - 5 Gears\r\n" + "\r\n" + "\r\n" + "Emission Standard\r\n" + "BS 6\r\n" + "\r\n"
					+ "Others\r\n" + "Idle Start/Stop");
		}

		else if (model.contentEquals("Ertiga")) {
			System.out.println(model + ": Price-11Lakhs\r\n" + "Engine Type :" + "K15C Smart Hybrid\r\n" + "\r\n"
					+ "Engine Displacement :" + "1462 cc\r\n" + "\r\n" + "Fuel Type :" + "Petrol\r\n" + "\r\n"
					+ "Max Power :" + "101.65bhp@6000rpm\r\n" + "\r\n" + "Max Torque :" + "136.8nm@4400rpm\r\n" + "\r\n"
					+ "Emission Norm Compliance :" + "BS VI\r\n" + "\r\n" + "No Of Cylinders :" + "4\r\n" + "\r\n"
					+ "Transmission :" + "Manual\r\n" + "\r\n" + "Gear Box :" + "5-Speed\r\n" + "\r\n"
					+ "Valves Per Cylinder :" + "4\r\n" + "\r\n" + "Drive Type :" + "2WD\r\n" + "\r\n"
					+ "Paddle Shift :" + "Not Available in Ertiga\r\n" + "\r\n" + "Kerb Weight :" + "1150-1205 Kg");
		}

		else if (model.contentEquals("Breeza")) {
			System.out.println(model + ": Price-10Lakhs\r\n" + "Engine\r\n"
					+ "1462 cc, 4 Cylinders Inline, 4 Valves/Cylinder, DOHC\r\n" + "\r\n" + "Engine Type\r\n"
					+ "K15B\r\n" + "\r\n" + "\r\n" + "Fuel Type\r\n" + "Petrol\r\n" + "\r\n" + "Max Power (bhp@rpm)\r\n"
					+ "103 bhp @ 6000 rpm\r\n" + "\r\n" + "\r\n" + "Max Torque (Nm@rpm)\r\n" + "138 Nm @ 4400 rpm\r\n"
					+ "\r\n" + "\r\n" + "Mileage (ARAI)\r\n" + "17 kmpl\r\n" + "\r\n" + "\r\n" + "Driving Range\r\n"
					+ "817 Km\r\n" + "\r\n" + "Drivetrain\r\n" + "FWD\r\n" + "\r\n" + "\r\n" + "Transmission\r\n"
					+ "Manual - 5 Gears\r\n" + "\r\n" + "\r\n" + "Emission Standard\r\n" + "BS 6\r\n" + "\r\n"
					+ "Dimensions & Weight\r\n" + "\r\n" + "Length\r\n" + "3995 mm\r\n" + "\r\n" + "Length\r\n" + "\r\n"
					+ "Width\r\n" + "1790 mm\r\n" + "\r\n" + "Width\r\n" + "\r\n" + "Height\r\n" + "1640 mm\r\n"
					+ "\r\n" + "Height\r\n" + "\r\n" + "Wheelbase\r\n" + "2500 mm\r\n" + "\r\n" + "Wheelbase\r\n"
					+ "\r\n" + "Ground Clearance\r\n" + "198 mm\r\n" + "\r\n" + "Ground Clearance\r\n" + "\r\n"
					+ "Kerb Weight\r\n" + "1115 kg");
		} else {
			System.out.println("There is no car in your budget");
		}

		String manoj2 = maruti.nextLine();
		System.out.println(manoj2 + " : okay sir, I had some confusion. \n"
				+ "so, please give me the Quotation of these cars\n" + "Thank You!\r");

		// showroom visit 2 using encapusalution return type
		Scanner hyundai = new Scanner(System.in);

		hun();
		ShowRoomVisit cars = new ShowRoomVisit();
		String manoj3 = hyundai.nextLine();
		System.out.println(cars.wel(manoj3 + " : Welcome sir! please take your seat"));
		String manoj4 = hyundai.nextLine();
		System.out.println(cars.wel(manoj4 + " : Have a cup of Tea"));
		String manoj5 = hyundai.nextLine();
		System.out.println(manoj5 + " : What is your Budget sir?");
		String manoj6 = hyundai.nextLine();
		System.out.println(manoj6 + " : around 10Lakhs sir");
		String manoj7 = hyundai.nextLine();
		System.out.println(manoj6 + " : Okay sir, In your budget we have Hyundai I20 and Hyundai Venue sir.");
		String manoj8 = hyundai.nextLine();
		System.out.println(manoj8 + " : Okay sir, Please tell the price and specification of these cars");

		String model2 = hyundai.nextLine();
		if (model2.contentEquals("I20")) {
			System.out.println(model2 + " : Price-9.8Lakhs\r\nEngine\n"
					+ "1197 cc, 4 Cylinders Inline, 4 Valves/Cylinder, DOHC\r\n" + "\r\n" + "Engine Type\r\n"
					+ "1.2 l Kappa\r\n" + "\r\n" + "Fuel Type\r\n" + "Petrol\r\n" + "\r\n" + "Max Power (bhp@rpm)\r\n"
					+ "82 bhp @ 6000 rpm\r\n" + "\r\n" + "Max Torque (Nm@rpm)\r\n" + "115 Nm @ 4200 rpm\r\n" + "\r\n"
					+ "Mileage (ARAI)\r\n" + "20.3 kmpl\r\n" + "\r\n" + "Driving Range\r\n" + "753 Km\r\n" + "\r\n"
					+ "Drivetrain\r\n" + "FWD\r\n" + "\r\n" + "Transmission\r\n" + "Manual - 5 Gears\r\n" + "\r\n"
					+ "Emission Standard\r\n" + "BS 6\r\n" + "\r\n" + "Dimensions & Weight\r\n" + "\r\n" + "Length\r\n"
					+ "3995 mm\r\n" + "\r\n" + "Length\r\n" + "\r\n" + "Width\r\n" + "1775 mm\r\n" + "\r\n"
					+ "Width\r\n" + "\r\n" + "Height\r\n" + "1505 mm\r\n" + "\r\n" + "Height\r\n" + "\r\n"
					+ "Wheelbase\r\n" + "2580 mm\r\n" + "\r\n" + "Wheelbase\r\n" + "\r\n" + "Ground Clearance\r\n"
					+ "170 mm");
		} else if (model2.contentEquals("Venue")) {
			System.out.println(model2 + " : Price-10.8Lakhs\r\nEngine\n"
					+ "1197 cc, 4 Cylinders Inline, 4 Valves/Cylinder, DOHC\r\n" + "\r\n" + "Engine Type\r\n"
					+ "1.2 Kappa\r\n" + "\r\n" + "Fuel Type\r\n" + "Petrol\r\n" + "\r\n" + "Max Power (bhp@rpm)\r\n"
					+ "82 bhp @ 6000 rpm\r\n" + "\r\n" + "Max Torque (Nm@rpm)\r\n" + "113.8 Nm @ 4000 rpm\r\n" + "\r\n"
					+ "Mileage (ARAI)\r\n" + "17.5 kmpl\r\n" + "\r\n" + "Driving Range\r\n" + "789 Km\r\n" + "\r\n"
					+ "Drivetrain\r\n" + "FWD\r\n" + "\r\n" + "Transmission\r\n" + "Manual - 5 Gears\r\n" + "\r\n"
					+ "Emission Standard\r\n" + "BS 6\r\n" + "\r\n" + "Dimensions & Weight\r\n" + "\r\n" + "Length\r\n"
					+ "3995 mm\r\n" + "\r\n" + "Length\r\n" + "\r\n" + "Width\r\n" + "1770 mm\r\n" + "\r\n"
					+ "Width\r\n" + "\r\n" + "Height\r\n" + "1617 mm\r\n" + "\r\n" + "Height\r\n" + "\r\n"
					+ "Wheelbase\r\n" + "2500 mm\r\n" + "\r\n" + "Wheelbase\r\n" + "\r\n" + "Ground Clearance\r\n"
					+ "195 mm");
		} else {
			System.out.println("There is no car in your budget");
		}

		String manoj9 = hyundai.nextLine();
		System.out.println(manoj9 + " : okay sir, I had some confusion. \n"
				+ "so, please give me the Quotation of these cars\n" + "Thank You!\r");

		// back to home using getter and setter method
		BackToHome home = new BackToHome();
		Scanner family = new Scanner(System.in);
		String father = family.nextLine();
		home.setScene1("Hi my dear son");
		System.out.println(father + "Father: " + home.scene1());
		String son = family.nextLine();
		home.setScene2("Hi Appa, today I visit two car showrooms Maruti and Hyundai");
		System.out.println(son + "Son: " + home.scene2());
		String father1 = family.nextLine();
		home.setScene1("Okay son which car whould you like?");
		System.out.println(father1 + "Appa: " + home.scene1());
		String son1 = family.nextLine();
		home.setScene2("Appa I have 3 choices\n");
		System.out.println(son1 + "Son: " + home.scene2());
		String[] show = { "*Maruti Breeza", "*Hyundai Venue", "*Maruti Ertiga" };
		for (String i : ms) {
			System.out.println(i);
		}

		System.out.println("These are my choices appa.");

		String father2 = family.nextLine();
		home.setScene1("Okay son you goThrough the Internet and check which one is Best");
		System.out.println(father2 + "Appa: " + home.scene1());

		String son2 = family.nextLine();
		home.setScene2(
				"Suddenly I think and ask to my appa you have any choices and what's about your dream car..please tell me?");
		System.out.println(son2 + "Son: " + home.scene2());

		String father3 = family.nextLine();
		home.setScene1("Said his dream car is Toyata Innova");
		System.out.println(father3 + "Appa: " + home.scene1());

		String son3 = family.nextLine();
		home.setScene2(
				"omg! Toyata Innova is your favourite car appa and I was change my mind...to buy Toyata Innova Crysta.\n");
		System.out.println(son3 + "Son: " + home.scene2());

		// happy moment using constructor method
		HappyMoment innova = new HappyMoment("Son : ", "Salesman : ", "Appa : ", "Waiter : ");
		Scanner toyata = new Scanner(System.in);
		String son4 = toyata.nextLine();
		System.out.println(innova.son + "next day morning, Me and My Appa visit Toyata Showroom");
		String sales2 = toyata.nextLine();
		System.out.println(innova.sales + " Welcome Sir, take your seat.");
		String waiter1 = toyata.nextLine();
		System.out.println(innova.waiter + " Take a fresh juice sir");
		String sales3 = toyata.nextLine();
		System.out.println(innova.sales + " What is your Budget sir?");
		String father4 = toyata.nextLine();
		System.out.println(innova.father + "suddenly said son, your budget is only 10Lakhs which car you want to buy?");
		String son5 = toyata.nextLine();
		System.out.println(innova.son + "your favourite car Daddy...my father is soo happy");
		String son6 = toyata.nextLine();
		System.out.println(innova.son
				+ "Sir,Toyata Innova Crysta ZX varient. actually my budget is 10Lakhs and remaining amount Loan sir. so, please tell me the loan details and Monthly EMI amount");
		String sales4 = toyata.nextLine();
		System.out.println(innova.sales + " okay sir, I give loan details");

		Scanner loan = new Scanner(System.in);
		float totalAmount = 3061637;
		float actualAmount = 1057000;
		System.out.println("Loan Amount is :" + (totalAmount - actualAmount));

		double l, r, n, EMI;
		System.out.println("Enter Loan amount: ");
		l = loan.nextFloat();

		System.out.println("Enter Interest Rate : ");
		r = loan.nextFloat();

		System.out.println("Enter Number of Years : ");
		n = loan.nextFloat();

		r = r / (12 * 100); // one month interest
		n = n * 12; // one month period

		EMI = (l * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
		System.out.println("Monthly EMI is= " + EMI + "\n");

		String son7 = toyata.nextLine();
		System.out.println(innova.son + "Okay sir thank you..Appa which color Innova I book?");
		String father7 = toyata.nextLine();
		System.out.println(innova.father + "White colour Innova..\n");

		// one fine day using polymorphism and method overriding
		String father8 = toyata.nextLine();
		father newCar = new father();
		newCar.method();

	}
}
