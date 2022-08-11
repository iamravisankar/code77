package mugesh012;

public class TableBrkCnte {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5th table upto 20 print only even number not using reminder formula
		
		// using break 16 
		// using continue 8 
		for (int i=2; i<=20 ; i=i+2) {
			if (i==8) {
				continue;
			}
			System.out.println(i+ "  x 5 =" + i*5);
			if (i==16) {
				break;			
			}
		}

	}

}
