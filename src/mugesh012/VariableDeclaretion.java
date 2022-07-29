package mugesh012;

public class VariableDeclaretion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here, i am declaring variable  
		String name1 = "Khan";
		double age = 25.5;
		float height = 5.9f;
		char bloodGroup ='O';
		boolean workingProf = true;
		// i am changing variable values 
		name1 = " Ramesh ";
		age = 45;
		long myAge = (long) age;  //Narrowing Casting
		height = 6.2f;
		bloodGroup ='A';
		String name2 = "Kannan";
		// i concat two string variable
		String fullName = name1+name2;
		// i print a person details
		System.out.println("Person Details");
		System.out.println("Name : "+ fullName);
		System.out.println("Age : " + myAge);
		System.out.println("Height : "+ height);
		System.out.println("Blood Group : " + bloodGroup);
	}

}
