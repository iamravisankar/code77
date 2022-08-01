package Manoj;

enum cricket {
	SACHIN(175), VIRAT(150), DHONI(200), DRAVID(120);

	private int runs;

	cricket(int r) {
		runs = r;
	}

	int getRuns() {
		return runs;
	}
}

public class Enum1 {
	public static void main(String[] args) {
		System.out.println("Man of the Match:");

		cricket player = cricket.DHONI;

		if (player == cricket.VIRAT || player == cricket.SACHIN) {
			System.out.println("Sachin and Virat are greatest batsmen");
		} else if (player == cricket.DRAVID) {
			System.out.println("Dravid is the best Test Batsman");
		} else {
			System.out.println("Dhoni is the best Captain");
		}
		for (cricket r : cricket.values())
			System.out.println(r + " has scored " + r.getRuns());
	}
}
