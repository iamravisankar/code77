package mugesh012;
import java.util.Scanner;

enum Offer {
	regularPrice(100),
	todayDeal(100-30),
	specialOffer(100-50);
	private int price;
	
	Offer(int o){
	   price = o;
	}
	int getPrice() {
		return price ;
	}
	
}
public class EnumDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		int userCheck=1;
		while( userCheck == 1) {
			System.out.println("enter 1 for offer list or exit 2 ");
			userCheck = myScan.nextInt();
			if (userCheck == 1) { 
	    System.out.println("Enter the your choices");	   
		System.out.println("Enter 1 check regular price");
		System.out.println("Enter 2 check today deal price");
		System.out.println("Enter 3 check special price");
		 int myOperator = myScan.nextInt();
		switch (myOperator) {
		case 1:
			Offer  myOffer = Offer.regularPrice;
			System.out.println(myOffer);
			System.out.println(myOffer.getPrice());
			//System.out.println(myOffer.ordinal());
		break;
		case 2:
			Offer  myOffer1 = Offer.todayDeal;
			System.out.println(myOffer1);
			System.out.println(myOffer1.getPrice());
			//System.out.println(myOffer1.ordinal());
			break;			
		case 3:
			Offer  myOffer2 = Offer.specialOffer;
			System.out.println(myOffer2);
			System.out.println(myOffer2.getPrice());
			//System.out.println(myOffer2.ordinal());
			break;
		   }
			} else 
				System.out.println("Thanks for visiting price list");
			}
}
	}
