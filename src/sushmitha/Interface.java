package sushmitha;
interface bird {
	  public void birdSound(); 
	  public void sleep(); 
	}
interface animal{
	public void animalsound();
}

	class cock implements bird,animal {
	  public void birdSound() {
	    System.out.println("The bird says cukoo");
	  }
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	  public void animalsound() {
		  System.out.println("louder");
	  }
	}

public class Interface {
	public static void main(String[] args) {
		  cock mycock = new cock();
		    mycock.birdSound();
		    mycock.sleep();
		    mycock.animalsound();
		  }
	

}
