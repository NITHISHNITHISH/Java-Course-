package first;

import java.util.Scanner;

public class AmountCalc {

	public static void main(String[] args) {
		 
		int[]denomination = {2000,500,100,50,10,1};
		int[] count;
		int amount;
		count =getValue(denomination);
		amount=amountCal(denomination,count);
		System.out.println("Total Amount with you is :"+amount);
	}
	
	
	public static int amountCal(int []denomination,int []count) {
		
		int amount =0;
		
		for(int i=0;i<denomination.length;i++) {
			
			amount = amount + denomination[i]*count[i];
		
		}
	return amount;
	}
	
	public static int[] getValue(int[] denomination) {
		Scanner scan = new Scanner(System.in); 
		int []count =new int[denomination.length];
		
		for(int i=0;i<count.length;i++) {
			System.out.print("Enter no.of "+denomination[i]+" notes\t:");
			count[i]=scan.nextInt();
		}
		return count;
	}

}
