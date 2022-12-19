package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		String input,result ="";
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String ");

		input = scan.nextLine();
		
		for(int i=(input.length()-1) ; i>=0;i--) {
			result = result+ (char)input.charAt(i);
		}
		
		System.out.println("Reversed String : "+result);
		
	}

}
