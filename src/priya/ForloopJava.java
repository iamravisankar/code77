package priya;

public class ForloopJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				for (int i = 0; i <= 10; i++) {
					int a;
					a = i * 5;
					if ((i % 2) == 0) {
						continue;
					}
					System.out.println(i + " x 5" + " = " + a);
					if (i == 25) {
						break;
					}
				}
			}

		

	}


