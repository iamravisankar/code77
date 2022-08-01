package sushmitha;
import java.util.Scanner;
import java.util.HashMap;
public class Hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name");
	    String Name =  myObj.nextLine();
	    System.out.println("enter age");
	    int age = myObj.nextInt();
	    System.out.println("enter salary");
	    double salary = myObj.nextDouble();
	    System.out.println("name is: " + Name); 
	    System.out.println("age is: " + age);
	    System.out.println("salary is: " + salary);
       HashMap<String,String> tamilnadu = new HashMap<String,String>();
		 tamilnadu.put("coimbatore", "chennai");
		 tamilnadu.put("trichy", "madurai");
		 tamilnadu.put("ramnad", "sivagangai");
		 tamilnadu.put("kodai", "ooty");
		 System.out.println(tamilnadu.get("coimbatore"));
}

}
