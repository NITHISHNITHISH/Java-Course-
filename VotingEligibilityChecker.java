package first;

import java.util.Scanner;

public class VotingEligibilityChecker {

	

	public static void main(String[] args) {

		getDetails();
		

	}

	public static void getDetails() {
		String name;
		char gender;
		int age;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter your Name :");
		name = scan.nextLine();
		System.out.println("Enter your Gender - 'M' for Male , 'F' for female");
		gender=scan.next().charAt(0);
		System.out.println("Enter your age");
		age=scan.nextInt();
		
	}
	
}
