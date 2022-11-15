package loopingStatments;

import java.util.Scanner;

public class PrintOddNumbers {

	public static void main(String[] args) {
		
		int range;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range");
		range=scan.nextInt();
		int i=0;
		while(i<=range) {
			
			if(i%2 !=0) {
				
				System.out.print(i+"\t");
			}
			i++;
		}

	}

}
