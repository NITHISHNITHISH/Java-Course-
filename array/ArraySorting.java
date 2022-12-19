package array;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {

		ArraySorting as =new ArraySorting();
		
		int [] numArr =as.getArray();
		numArr=as.sorting(numArr);
		
		System.out.println("3rd Smallest element of the Array : "+numArr[2]);
		System.out.println("2nd Largest element of the Array : "+numArr[numArr.length-2]);

	}


	
	public int[] getArray() {
		int size;
		int[] input ;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the Array : ");
		size = scan.nextInt();
		input= new int[size];
		System.out.println("Enter the Array Elements : ");

		for (int i = 0; i < size; i++) {
			input[i] = scan.nextInt();
		}
		return input;

	}

	public int[] sorting(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
}
