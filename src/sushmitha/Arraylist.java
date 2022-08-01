package sushmitha;
import java.util.ArrayList;

public class Arraylist {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>vehicles = new ArrayList<String>();
	    vehicles.add("car");
	    vehicles.add("bike");
	    vehicles.add("auto");
	    vehicles.add("bus");
	    System.out.println(vehicles);
	    System.out.println(vehicles.get(0));
	    vehicles.set(1,"ship");
	    System.out.println(vehicles);


	}

}
