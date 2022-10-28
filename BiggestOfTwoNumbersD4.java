package first;

import java.util.Scanner;

public class BiggestOfTwoNumbersD4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a,b;
		
		int big ;
		
		System.out.println("Enter 1st Number :");
		a=scan.nextInt();
		System.out.println("Enter 2st Number :");
		b=scan.nextInt();
		
		big = a>b ? a : b;
		System.out.println("Biggest of two numbers "+a+" and "+b+ " :" +big);
		
		
		
		
		
		
		
		
	}

}
