package array;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {


		int [] num= {1,2,3,4,5,6,7,8,9};
		int[] copy=Arrays.copyOf(num,num.length);
		int check;
		if(num.length%2 ==0)
			check=num.length/2;
		else
			check=(num.length-1)/2;
		
		for(int i=0;i<check;i++) {
			
			int temp =num[(num.length-1)-i];
			num[(num.length-1)-i]=num[i];
			num[i]=temp;
			
		}
		
		System.out.println("Before : "+Arrays.toString(copy));

		System.out.println("After :"+Arrays.toString(num));
		
	} 
		

}
