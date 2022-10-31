package first;

import java.util.Scanner;

public class OddOrEvenD4 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Number");
		int a;
		
		a=scan.nextInt();
		
		String result;
		
		result = (a%2 == 0) ? "Even" : "Odd";
		
		System.out.println("Given Number "+ a +" is : " +result);
	
		
		
		
		
		
	}

}
