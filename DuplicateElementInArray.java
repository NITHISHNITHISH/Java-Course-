package first;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,1};
		int[] duplicate=new int [numbers.length];
		
		
		int duplicateCounter=0;
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				
				if(numbers[i]==numbers[j]) {
					duplicate[0]=numbers[i];
					duplicateCounter++;
				}
				
			}
		}
		
		if(duplicateCounter>0) {
		for(int i :duplicate) {
			System.out.print(i);
		}
		}
		else
		System.out.println("No Duplicate in the Array");

	}

}
