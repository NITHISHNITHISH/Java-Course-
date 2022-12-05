package array;

public class ArrayDeclaration {

	public static void main(String[] args) {

		
		int[] num = new int [5];
		
		num[0]=22;
		num[1]=32;
		num[2]=67;
		num[3]=34;
		num[4]=17;
		
		
		for(int i=0;i<num.length;i++) {
			System.out.println((i)+" = "+num[i]);
		}
	}

}
