package controlStatments;

import java.util.Scanner;

public class GradeEligiblity {

	public static void main(String[] args) {
		GradeEligiblity ge = new GradeEligiblity();
		ge.eligibilityChecker();
		
	}
	
	public void eligibilityChecker() {
		
		Scanner scan=new Scanner(System.in);
		int sub1,sub2,sub3,sub4,sub5;
		System.out.println("Enter 5 Suject Marks ");
		System.out.print("Subject 1 = ");
		sub1=scan.nextInt();
		System.out.print("Subject 2 = ");
		sub2=scan.nextInt();
		System.out.print("Subject 3 = ");
		sub3=scan.nextInt();
		System.out.print("Subject 4 = ");
		sub4=scan.nextInt();
		System.out.print("Subject 5 = ");
		sub5=scan.nextInt();
		
		if(sub1 >=35 &&  sub2 >=35 && sub3 >=35 && sub4 >=35 && sub5 >=35)
			System.out.println("your are \"Eligible\" for next grade");
		else
			System.out.println("Not Eligible");
		
	}

}
