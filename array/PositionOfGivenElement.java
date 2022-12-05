package array;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOfGivenElement {

	public static void main(String[] args) {

		int[][] arr = { { 2, 3, 4 }, { 3, 4, 3 }, { 1, 9, 8 } };
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Element :");
		int num=scan.nextInt();

	    int[] position = null;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(num == arr[i][j])
				{
					 position= new int[] { i, j };
					//System.out.println("Position of Given "+num+" is "+arr[i][j]);
                    System.out.println("position is:" + Arrays.toString(position));

				}
				
				}
			}
	}

}
