package array;

import java.util.Arrays;

public class DuplicateRemover {

	public static void main(String[] args) {

		
		int [] num = {1,2,3,4,3,5,2,1,6,9,5,3};
		
		int [] copy =Arrays.copyOf(num, num.length);
		
		for(int i=0;i<num.length;i++) {
		
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]== num[j])
					num[j]=0;
			}
			
			
		}
		System.out.println("Before :"+Arrays.toString(copy));
		System.out.println("After  :"+Arrays.toString(num));
	}

}
