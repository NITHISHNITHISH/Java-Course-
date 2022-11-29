package Pattern;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {

			int a=1;
			for (int j = i; j <= num - 1; j++) {
				System.out.print(" ");
				a++;
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}
