package array;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String [] args) {
		
		int[] num=new int[10];
		int big,sbig;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 10 elements ");
		
		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
		}
		
		big=num[0];
		sbig=num[1];
		
		for(int i=2;i<num.length;i++) {
			
			if(num[i]>sbig && num[i]>big) {
				sbig=big;
				big=num[i];	
			}
			if(num[i]>sbig) {
				sbig=num[i];
			}
		
		}
		
		System.out.println("Second Biggest = "+sbig);
	}
	
	
}
