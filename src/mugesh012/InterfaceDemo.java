package mugesh012;
interface One1 {
	  public void interfacecall1(); 
	}

interface  Two2  {
	
	public void interfacecall2(); 
}
	
class Three implements Two2,One1{
	  public void interfacecall1() {  
	    System.out.println("interface class one call ");
	  }
	  public void interfacecall2() {
		  System.out.println("interface class two call ");
	  }
	  
	  public void myMethod() {
		  System.out.println("hii, i am normal method");
	  }
	}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three myInterfaceCall = new Three();
		myInterfaceCall.interfacecall1();
		myInterfaceCall.interfacecall2();
		myInterfaceCall.myMethod();
	}

}
