package mugesh012;

public class ArraysDemo1 {
  // TODO Auto-generated method stub
		int a =78;
		int[] mSet = {56, 16, 40};
		String name3 ="ganesh";
		int[][] mark = { {56, a, 35, 40}, mSet };
		String name[][] = {{"mugesh", "ramesh", name3},{"ravi", "balu"}}; 
		name[0][2]="suresh";
		mark[0][2]=78;
	    for (int i = 0; i <mark.length; ++i) {
	    for(int j = 0; j < mark[i].length; ++j) {
	    	if (mark[i][j] == 40) { //find and replace
	    		mark[i][j] = 80;
	    	}
	           System.out.println(mark[i][j]);
	        }
	}

	    System.out.println(Arrays.deepToString(name));
}

}
