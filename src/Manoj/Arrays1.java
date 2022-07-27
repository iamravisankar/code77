package Manoj;

public class Arrays1 {
public static void main(String[] args) {
		
		String[] name = {"manoj","karthik","ravi","shankar","mugesh","vivek","pothi"};
		
		String find = "mugesh";
		int index = 0;
		
		for(int i = 0; i < name.length; i++) {
			
			if(name[i] == find) {
				index = i;
				break;
			}
			
		}
		System.out.println("mugesh name is index of : "+ index);
		for (int i = 0; i < name.length; i++) {
			if(name[i]==find) {
				name[i] = "superstar";
			}
			System.out.println(name[i]);
		}
		System.out.println("the name is replaced to superstar");
	}

}
