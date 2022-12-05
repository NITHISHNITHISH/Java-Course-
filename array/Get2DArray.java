package array;

import java.util.Arrays;
import java.util.Scanner;

public class Get2DArray {

	public static void main(String[] args) {

		int row,col;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of Rows ");
		row=scan.nextInt();
		System.out.println("Enter no of Column ");
		col=scan.nextInt();
		
		int [][] numArray = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) {
				
				numArray[i][j]=scan.nextInt();
			}
		}
		
		
		System.out.println(Arrays.deepToString(numArray));
	}

}
