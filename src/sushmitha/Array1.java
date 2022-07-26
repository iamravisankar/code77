package sushmitha;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] shop = {"medical","fruit","vegetable"};
		System.out.println(shop[0]);
		System.out.println(shop[1]);
		shop[2] = "stationary";
		System.out.println(shop[2]);
		
		for(int i=0;i<shop.length;i++) {
			System.out.println(i);
			}
		System.out.println("tnagar");
		int workers [][] = {{1,2,3,4,5},{6,7,8,9,10}};
		for(int i = 0;i<workers.length;i++) {
			for(int j = 0;j<workers[i].length;j++) {
			System.out.println(workers[i][j]);
			}
			}
		System.out.println("experienced workers");
	}
		

	}


