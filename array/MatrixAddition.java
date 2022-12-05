package array;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {

		
		int [][] arr1= {{1,2,3},{2,3,4},{5,7,6}};
		int [][] arr2= {{5,8,4},{8,6,2},{8,2}};
		int row1, col1, row2, col2;

		row1 = arr1.length;
		col1 = arr1[0].length;
		row2 = arr2.length;
		col2 = arr2[0].length;
		int [][] result =new int [row1][col1];
		
		if((row1==row2) && (col1==col2)) {
			for(int i =0;i<arr1.length;i++) {
				for(int j=0;j<arr1[i].length;j++) {
					result [i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			System.out.println("Result :"+Arrays.deepToString(result));
		}
		else {
			System.out.println("Can't Add");
		}
	}

}
