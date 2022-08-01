package priya;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateJava {

   public static void main(String[] args) {
		
			 HashMap<String, Integer> NameAndAge = new HashMap<String, Integer>();
			 NameAndAge.put("priya", 22);
			 NameAndAge.put("diya", 2);
			 NameAndAge.put("suba", 20);
			 NameAndAge.put("raghu", 31);
			 Iterator<Entry<String, Integer>> it =NameAndAge.entrySet().iterator();
			  
			    while(it.hasNext()) {
			      System.out.println(it.next());
			    	}
			    
		}

	}

