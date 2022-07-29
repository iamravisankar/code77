package priya;

public class IfelseJava {


	public static void main(String[] args) {



			System.out.println("Enter the marks obtained: ");
			int mark = 90;

			if (mark < 50) {

				System.out.println(mark);
				System.out.println("fail");

			} else if (mark >= 50 && mark < 60) {

				System.out.println(mark);
				System.out.println("D grade");

			} else if (mark >= 60 && mark < 70) {

				System.out.println(mark);
				System.out.println("C grade");

			} else if (mark >= 70 && mark < 80) {
				
				System.out.println(mark);
				System.out.println("B grade");

			} else if (mark >= 80 && mark < 90) {
				
				System.out.println(mark);
				System.out.println("A grade");

			} else if (mark >= 90 && mark <= 100) {
				
				System.out.println(mark);
				System.out.println("A+ grade");

			} else {
				
				System.out.println(mark);
				System.out.println("Invalid!");
			}
		}
	}

