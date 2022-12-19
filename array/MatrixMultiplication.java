package array;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		//int [][] arr1= {{1,2,3},{2,3,4}};
		//int [][] arr2= {{5,8,3},{8,6,4},{3,4,4}};
		
		int [][] arr1= {{1,2},{4,5}};
		int [][] arr2= {{3,4},{5,6}};
		int row1, col1, row2, col2;

		row1 = arr1.length;
		col1 = arr1[0].length;
		row2 = arr2.length;
		col2 = arr2[0].length;
		int [][] result =new int [row1][col2];
		//
		
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<col1;k++)
				result[i][j]=result[i][j]+(arr1[i][k]*arr2[k][j]);
			}
		}
		System.out.println(Arrays.deepToString(result));
		
		
	}

}
