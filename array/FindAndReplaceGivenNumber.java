package array;

import java.util.Scanner;

public class FindAndReplaceGivenNumber {

	public static void main(String[] args) {

		boolean flag=false;
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter the Number to replace :");
		int a=scan.nextInt();
		System.out.println("Replace with :");
		int b=scan.nextInt();
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<num.length;i++) {
			
			if(a==num[i])
			{
				num[i]=b;
				flag=true;
			}
		}
		
		if(flag)
			System.out.println("Replaced ");
		
		else
			System.out.println("No such number present in the Array");
		
		
	}

}
