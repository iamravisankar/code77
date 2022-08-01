package sushmitha;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> students = new ArrayList <String>();
	    students.add("jay");
	    students.add("muthu");
	    students.add("vasu");
	    students.add("divya");
	  Iterator<String> it = students.iterator();
      while(it.hasNext()) {
      System.out.println(it.next());
      }
      System.out.println(students.size());

	}

}
