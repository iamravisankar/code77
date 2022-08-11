package sushmitha;
import java.util.HashSet;
public class Hashset1 {
	String name = "sai";
	int exp = 2;
	double incre = 500;
	

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> members = new HashSet<String>();
	    members.add("sai");
	    members.add("shalini");
	    members.add("swe");
	    members.add("raji");
	    members.add("devi");
	    System.out.println(members.contains("swe"));
	    System.out.println(members.size());
	    Hashset1 myObj = new Hashset1();
	    System.out.println(myObj.name);
	    System.out.println(myObj.exp + " yrs experience");
	    System.out.println(myObj.incre + " increamented");

	}
}
}
