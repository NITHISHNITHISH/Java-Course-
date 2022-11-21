package loopingStatments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		PrimeNumber pn = new PrimeNumber();
		pn.primeFinder1(); // with more checks
		pn.primeFinder2(); // with less checks
	}

	public void primeFinder2() {

		int num, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = scan.nextInt();

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
				if (count > 1) {
					System.out.println("Not a prime Number");
					break;
				}
			}

		}

		if (count == 1)
			System.out.println("Prime Number");
	}

	public void primeFinder1() {

		int num, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = scan.nextInt();

		for (int i = 2; i <= num; i++) {
			if (num % i == 0)
				count++;

		}

		if (count == 1)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}

}
