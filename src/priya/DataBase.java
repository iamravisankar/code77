package priya;

public class DataBase {
	int ht1;
	String name1;
	public DataBase (int ht, String name) {

		name1 = name;
		ht1 = ht;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase input = new DataBase(34, "priya");
		System.out.println("NAME : " + input.name1);
		System.out.println("HT : " + input.ht1);
	}

}
