package mugesh012;

public class MethodConcept {
	static void cough(int n) {
		say("cough", n);
		//sneeze(5);
	}
	static void say(String word, int n) {
		
		for (int i =0; i<n; i++) {
			System.out.println(word);
		}
		
	}
	static void sneeze(int n) {
		say("achoo!", n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cough(5);

	}

}
