package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingPreference {

	public static void main(String[] args) {

		ArraySortingPreference as =new ArraySortingPreference();
		
		int [] numArr =as.getArray();
		System.out.println("Input Array"+Arrays.toString(numArr));
		System.out.println("increment"+Arrays.toString(as.increSorting(numArr)));
		System.out.println("decrement"+Arrays.toString(as.decreSorting(numArr)));

	}


	
	public int[] getArray() {
		int size;
		int[] input ;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of  Array : ");
		size = scan.nextInt();
		input= new int[size];
		System.out.println("Enter the Array Elements : ");

		for (int i = 0; i < size; i++) {
			input[i] = scan.nextInt();
		}
		return input;

	}

	public int[] increSorting(int[] arr) {

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
	public int[] decreSorting(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
}
}
