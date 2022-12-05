package array;

import java.util.Arrays;
import java.util.Scanner;

public class GetArrayWithoutDuplicate {

	public static void main(String[] args) {

		GetArrayWithoutDuplicate ga=new GetArrayWithoutDuplicate();
		ga.getArray();

	}

	public void getArray() {
		int size;
		int[] input ;
		boolean flag=false;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		size = scan.nextInt();
		input= new int[size];
		System.out.println("Enter the Array Elements : ");

		for (int i = 0; i < size; i++) {
			input[i] = scan.nextInt();
			
			if(i>0) {
				do{
					for(int j=i-1;j>=0;j--) {
						if(input[i]==input[j]) {
							flag=true;
							System.out.println("Duplicate not Allowed");
							System.out.println("Enter the value other than "+input[j]);
							System.out.print("input["+i+"] :");
							input[i] = scan.nextInt();
							break;
						}
						flag=false;
					}
					
				}while(flag);
			}
		}
		System.out.println("Array : "+Arrays.toString(input));

	}
}
