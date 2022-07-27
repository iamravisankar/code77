package Manoj;

import java.util.Scanner;

public class IfElseLeap {
	public static void main(String[] args) {
		System.out.println("Enter the Year: ");
		Scanner number = new Scanner(System.in);
		int year = number.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");    // 0 && 0 = 0, 0 && 1 = 0, 1 && 0 = 0, 1 && 1 = 1
												// 0 || 0 = 0, 0 || 1 = 1, 1 || 0 = 1, 1 && 1 = 1
		} else {
			System.out.println("COMMON YEAR");
		}
		System.out.println((year % 4 == 0));
		System.out.println((year % 100 != 0));
		System.out.println((year % 400 == 0));
	}

}
