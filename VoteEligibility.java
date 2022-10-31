package operators;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {

		String name;
		char gender;
		int age;
		boolean eligibility ;
		String output;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the below Details");
		System.out.print("Name :");
		name=scan.nextLine();
		System.out.print("Gender : 'M' for Male, 'F' for female ");
		gender=scan.next().charAt(0);
		System.out.print("Age");
		age=scan.nextInt();
		
		
		eligibility= age>18 ? true :false;
		
		output = eligibility ? (gender=='M' ? ("Mr."+name+" is Eligible to vote") : ("Mrs."+name+" is eligible to vote")) : "Sorry!!! Not Eligible"; 
		
		System.out.println(output);
	}

}
