package loopingStatments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Factorial fact=new Factorial();
		fact.factorialFinder();

		
	}

	public void factorialFinder() {
		int num;
		long result=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number :");
		num=scan.nextInt();
		if(num>=0) {
		while(num!=0) {
			result=result*num;
			num --;
		}
		System.out.println("Factorial : " +result);
		}
		else {
			System.out.println("Only Positive Integers are Allowed");
		}
		
		
	}
	
	
	
}
