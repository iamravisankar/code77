package priya;
import java.util.Scanner;
public class WhileloopJava {

	
			static Scanner input = new Scanner(System.in);
			public static void main(String[] args) {

				int i = 1;

				System.out.println("Enter the number: ");
		         
				int n = input.nextInt();

				System.out.println("The multiplication table of " + n + " is: ");

				while (i <= 10) {

					System.out.println(i + " x " + n + " = " + (n * i));

					i++;
				}
			}
		

	}


