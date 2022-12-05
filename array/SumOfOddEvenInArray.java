package array;

import java.util.Arrays;

public class SumOfOddEvenInArray {

	public static void main(String[] args) {

		int oddSum=0,evenSum=0;
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2 == 0)
				evenSum=evenSum + num[i];
			else
				oddSum=oddSum+num[i];
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println("Odd Sum : "+oddSum);
		System.out.println("Even Sum :"+evenSum);
		
		
	}

}
