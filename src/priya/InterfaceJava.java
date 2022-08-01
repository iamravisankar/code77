package priya;

interface computer {
	public void oldenDays();

	public void mouse();
}

interface laptops {
	public void goldenDays();
}

class Mac implements computer, laptops {
	public void oldenDays() {
		System.out.println("computer mostly used in olden days.");
	}

	public void goldenDays() {
		System.out.println("Mac in nowadays");
	}

	public void mouse() {
		System.out.println("Used in both laptops and computer");
	}
}

public class InterfaceJava {
	public static void main(String[] args) {
		Mac myLaptops = new Mac();
		myLaptops.oldenDays();
		myLaptops.mouse();
		myLaptops.goldenDays();

	}
}