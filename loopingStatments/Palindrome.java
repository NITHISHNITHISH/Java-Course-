package loopingStatments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=scan.nextInt();
		int result=0;
		int temp=num;
		while(num>0) {
			result = result*10 + num%10;
			num= num/10;
		}
		if(result == temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
	}

}
