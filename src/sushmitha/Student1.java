package sushmitha;

import java.util.Scanner;

public class Student1 {
	String name;
	int age;
	int salary;
	

	public int getAge() {
		System.out.println("Enter staff  age ");
		Scanner myObj = new Scanner(System.in);
		age = myObj.nextInt();
		
		return age;
	}


	public void setAge() {
		
		System.out.println("staff age is " + age);
	}


	public int getSalary() {
		System.out.println("Enter staff salary ");
		Scanner myObj = new Scanner(System.in);
		salary = myObj.nextInt();
		return salary;
	}


	public void setSalary() {
		System.out.println("staff salary is " + salary);
		
		
	}


	public String getName() {
		System.out.println("enter staff name");
		Scanner myObj = new Scanner(System.in);
		 name = myObj.nextLine();
		return name;
	}


	public void setName() {
	    System.out.println("staff name is " + name);
	}

}
