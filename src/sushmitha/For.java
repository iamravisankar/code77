package sushmitha;

public class For {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] cars = {"bmw","toyato"};
		for (int i = 0; i <= 10; i = i + 2) {
			if (i == 4) {
			    break;
			}
			for (String j : cars) {
		      System.out.println(i);
		      System.out.println(j);
		    }
		}
	}

}
