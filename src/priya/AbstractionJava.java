package priya;

abstract class Abstract {
	public abstract void singerName();
}
class name extends AbstractionJava {
	public void singerName() {
		System.out.println("song : lalalalila lalailala lalalaila lalaialalal");
	}
}
class music extends AbstractionJava {
	public void singerName() {
		System.out.println("song : dudutoo duudooo");
	}
}
public class AbstractionJava {
	public static void main(String[] args) {
		name myName = new name(); // Create a Pig object
		myName.singerName();

	}
}
