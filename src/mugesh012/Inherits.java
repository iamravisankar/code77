package mugesh012;
class One{
	 public void myCall() {
			System.out.println("one cal");
		}
}
class Two extends One {
		public void myCall() {
			System.out.println("two cal");
		}
		public void myCall1() {
			System.out.println("two cal");
		}
	}
class Three extends Two{
		public void myCall() {
			System.out.println("three cal");
		}
	}
class Four extends Three {
		public void myCall() {
			System.out.println("four cal");
		}
	}
public class Inherits  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four myCal = new Four();
		myCal.myCall();
		myCal.myCall1();

	}
}
