package array;

public class ArrayMatrixComparision {

	public static void main(String[] args) {

		int[][] arr1 = { { 2, 3, 4 }, { 3, 4, 3 }, { 1, 9, 8 } };
		int[][] arr2 = {  { 3, 4, 3 }, { 0, 9, 8,4 } };

		int row1, col1, row2, col2;

		row1 = arr1.length;
		col1 = arr1[0].length;
		row2 = arr2.length;
		col2 = arr2[0].length;

		//if ((row1 == row2) && (col1 == col2)) {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					if (arr1[i][j] != arr2[i][j]) {

						System.out.println("Not Equal");
						break;
					}

				}
				//System.out.println("Equal");
			}
			//System.out.println("Equal");
		
		/*else
			System.out.println("not Equal");
*/
	}

}
