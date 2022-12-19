package array;

import java.util.Arrays;
import java.util.Scanner;

public class IncrementalArray {

	public static void main(String[] args) {

		int size,cnum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		size = scan.nextInt();
		int [] numArray = new int [size];
		
		
		for(int i=0;i<size;i++) {
			numArray[i]=scan.nextInt();
			cnum=numArray[i];
			if(i>0) {
			while(cnum<numArray[i-1]) {
				System.out.println("Number must be greater than "+numArray[i-1]);
				numArray[i]=scan.nextInt();
				cnum=numArray[i];
			}
			
			}
			
		}
		
		System.out.println(Arrays.toString(numArray));
		
	}

}
