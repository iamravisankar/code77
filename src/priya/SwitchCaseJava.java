package priya;
import java.util.Scanner;

public class SwitchCaseJava {
			static Scanner in = new Scanner(System.in);
			public static void main(String[] args) {
				//we have to enter the a and b value 
				//it print the first value is belongs to in which case
				
				int a, b;
				System.out.println("Enter a and b");
				
				a = in.nextInt();
				b = in.nextInt();

				switch (b) {

				case 1:
					switch (a) {
					case 1:
						System.out.println("b is 1");
						break;

					case 2:
						System.out.println("b is 2");
						break;

					case 3:
						System.out.println("b is 3");
						break;
					}
					break;

				case 2:
					System.out.println("a is 2");
					break;

				case 3:
					System.out.println("a is 3");
					break;

				default:
					System.out.println("default statement here");
					break;
				}

			}

		}

	


