package priya;

import java.util.ArrayList;

public class ArrayJava {
	public static void main(String[] args) {
		ArrayList<String> StudentNameList = new ArrayList<String>();
		ArrayList<String> StaffName = new ArrayList<String>();
		ArrayList<Integer> InterviewMark = new ArrayList<Integer>();
		ArrayList<Double> InterviewMark1 = new ArrayList<Double>();
		StudentNameList.add("1. Mugesh");
		InterviewMark.add(50);
		InterviewMark1.add(99.9);
		StudentNameList.add("2. Manoj");
		InterviewMark.add(51);
		InterviewMark1.add(95.5);
		StudentNameList.add("3. Priya");
		InterviewMark.add(49);
		InterviewMark1.add(94.5);
		StudentNameList.add("4. Sushmitha");
		InterviewMark.add(52);
		InterviewMark1.add(98.5);
		StaffName.add("RAVI");
		System.out.println("Tutor Name:" + StaffName + "\n");
		System.out.println("Java class students name list & interview marks :\n");

		for (int i = 0; i < StudentNameList.size(); i++) {
			System.out.println(StudentNameList.get(i));
			System.out.println("First round interview mark :" + InterviewMark.get(i));
			System.out.println("Second round interview mark :" + InterviewMark1.get(i) + "\n");
		}

	}

}
