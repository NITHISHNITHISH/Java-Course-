package loopingStatments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		a=scan.nextInt();
		if(a>1) {
		if(a%2 != 0 || a==2) {
			System.out.println(a+" is a Prime number");
		}
		else
			System.out.println(a+"is Not a Prime Number");
		}
		else
			System.out.println("Please enter number above 1 ");
	}

}
