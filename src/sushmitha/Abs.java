package sushmitha;
abstract class Abstract1{
	 public abstract void birdsSound();
		   }
class peocock extends Abstract1 {
	  public void birdsSound() {
	     System.out.println("The peocock says: kee kee");
	  }
	}

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract1 mypeocock = new peocock(); 
	    mypeocock.birdsSound();
	    

	}

}
