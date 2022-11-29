package Pattern;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=scan.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
