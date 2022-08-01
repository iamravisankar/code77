package sushmitha;
import java.util.LinkedList;
public class Linked {
	static void mymethod() {
		System.out.println("regular customer");
		
	}
	public void name(){
		System.out.println("raji");
		
	}
	public void discount() {
		System.out.println("with 10 % discount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>fruits = new LinkedList<String>();
        fruits.add("mango");
	    fruits.add("apple");
	    fruits.add("banana");
	    fruits.addFirst("pineapple");
	    fruits.addLast("orange");
	    System.out.println(fruits);
	    int a =12;
	    int b =13;
	    if(a <= b) {
	    	System.out.println("delivery done for");
	    }
	    else {
	    	System.out.println("delayed");
		}
	    Linked myObj = new Linked();
	    mymethod();
	    myObj.name();
	    myObj.discount();
	    }

}
