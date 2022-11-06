package controlStatments;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

	public static void main(String[] args) {

		int big,small;
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter 1st Number :");
		a=scan.nextInt();
		System.out.print("Enter 2st Number :");
		b=scan.nextInt();
		
		if(a>b)
			System.out.println("A is big");
		else
			System.out.println("B is big");

	}

}
