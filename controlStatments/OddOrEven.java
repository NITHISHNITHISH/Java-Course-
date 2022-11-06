package controlStatments;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num =scan.nextInt();
		boolean output=oddEvenFind(num);
		if(output)
			System.out.println("Given Number is Even");
		else
			System.out.println("Given Number is Odd");

	}

	public static boolean oddEvenFind(int num) {
		 
		boolean even=false;
		
		if(num%2 == 0)
			even=true;
	
		return even;
	}
}
