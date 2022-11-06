package controlStatments;

import java.util.Scanner;

public class VoteEligibility2 {

	public static void main(String[] args) {

		String name;
		char gender;
		int age;	
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the below Details");
		System.out.print("Name :");
		name=scan.nextLine();
		System.out.print("Gender : 'M' for Male, 'F' for female ");
		gender=scan.next().charAt(0);
		System.out.print("Age");
		age=scan.nextInt();
		
		if(age>18) {
			if(gender == 'M')
				System.out.println("Mr. "+name+" is Eligible for vote");
			else
				System.out.println("Ms/Mrs. "+name+" is Eligible for vote");
		}
		else
			System.out.println("Not Eligible for vote .Please wait "+(18-age)+" years");
	}
}
