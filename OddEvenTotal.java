package loopingStatments;

import java.util.Scanner;

public class OddEvenTotal {

	public static void main(String[] args) {

		int range,oddTotal = 0,evenTotal = 0;
		int evenCounter = 0,oddCounter = 0;
		double oddAverage,evenAverage;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Range :");
		range=scan.nextInt();
		int i=0;
		while(i<=range) {
			if(i%2 == 0) {
				evenCounter++;
				evenTotal=evenTotal+i;
			}
			else {
				oddCounter++;
				oddTotal=oddTotal+i;
			}
			i++;
		}
		oddAverage=(double)(oddTotal)/oddCounter;
		evenAverage=(double)(evenTotal)/evenCounter;
		
		
		System.out.println("Even Numbers Total :"+evenTotal);
		System.out.println("Odd Numbers Total :"+oddTotal);
		System.out.println("Even Numbers Average:"+evenAverage);
		System.out.println("Odd Numbers Average:"+oddAverage);

	}

}
