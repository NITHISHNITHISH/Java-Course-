package array;

import java.util.Arrays;

public class TransposeOfMatrix {

	public static void main(String[] args) {

		int [][] numArray = {{1,2,3},{4,5,6},{7,8,9}};
		int row,col;
		row=numArray.length;
		col=numArray[0].length;
		int [][] transpose=new int[col][row];
		
		for(int i=0 ; i<row;i++) {
			for(int j=0;j<col;j++) {
				transpose[j][i]=numArray[i][j];
			}
		}
		
		System.out.println("Original :"+Arrays.deepToString(numArray));
		System.out.println("Transpose :"+Arrays.deepToString(transpose));

		for(int i=0 ; i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(transpose[i][j]);
			}
			System.out.println();
			}
	}

}
