package array;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		int [] copy=new int [num.length];
		for(int i=0;i<num.length;i++) {
			copy[i]=num[i];
		}
		
		System.out.println("Original Array : "+Arrays.toString(num));
		System.out.println("Copy :"+Arrays.toString(copy));
	}

}
