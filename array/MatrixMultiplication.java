package array;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int [][] arr1= {{1,2,3},{2,3,4},{5,7,6}};
		int [][] arr2= {{5,8},{8,6},{3,4}};
		int row1, col1, row2, col2;

		row1 = arr1.length;
		col1 = arr1[0].length;
		row2 = arr2.length;
		col2 = arr2[0].length;
		int [][] result =new int [row1][col2];
		//
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				for(int k=0;k<arr2[i].length;k++)
				result[i][j]=result[i][j]+(arr1[j][k]*arr2[j][k]);
			}
		}
		System.out.println(Arrays.deepToString(result));
		
		
	}

}
