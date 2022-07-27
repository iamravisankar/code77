package Manoj;

enum Rank {
	PASS("P"), FAIL("F");// group of constants assign only two values

	private String abbr; // abbrivation

	Rank(String ab) {
		abbr = ab;
	}

	String getAbbr() {
		return abbr;
	}
}

public class Enum {
	public static void main(String[] args) {
		Rank r = Rank.PASS; // create object for enum name
		System.out.println(r);
		System.out.println(r.getAbbr());
		System.out.println(r.ordinal());

		Rank r1 = Rank.FAIL;
		System.out.println(r1);
		System.out.println(r1.getAbbr());
		System.out.println(r1.ordinal());
	}
}
