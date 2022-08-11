package mugesh012;
abstract class One{	
	 public abstract void absMethod1();
	  public void firstMethd() {
	    System.out.println("i am in abstract normal class");
	  }
	}
abstract class Two extends One {
	 public abstract void absMethod2();
	 public void firstMethd() {
		    System.out.println("i am in abstract class but i am override");
		  }
	  public void secoundMethod() {
	    System.out.println("i am extends form abstract class. but i am normal");
	  }
	
	}
class Three extends Two {
	public void absMethod1() {
		System.out.println("One abs call");
	}
	public void absMethod2() {
		System.out.println("Two abs call");
	}
	
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three myCall = new Three();
		myCall.absMethod1();
		myCall.absMethod2();
		myCall.firstMethd();
		myCall.secoundMethod();

	}

}
