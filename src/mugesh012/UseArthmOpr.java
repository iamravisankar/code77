package mugesh012;

public class UseArthmOpr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // SIMPLE INTEREST 
				// SI=(P × R × T)/100
					
				int PrincipalAmount =4000;
				int RateOfInterest = 7; // % 0.70
				int year = 2;
				int SI = (PrincipalAmount*RateOfInterest*year)/100;
				System.out.println("simple interest "+ SI);
								
				// COMPOUND INTEREST
				//Principal (1 + Rate)^Time − Principal
				double m = 1.07;	
				double H = Math.pow(m, 2);
				System.out.println(H);		
				double CI = PrincipalAmount *H - PrincipalAmount;
				System.out.println("compound interest " + CI);

	}

}
