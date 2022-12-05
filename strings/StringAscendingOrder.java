package strings;

import java.util.Scanner;

public class StringAscendingOrder {

	public static void main(String[] args) {

		String input ;
		Scanner scan = new Scanner(System.in);
		
		input =scan.nextLine();
		
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)<input.charAt(i-1)) {
				
				char temp = input.charAt(i);
				char = input.charAt(i-1);
			}
		}
		
	}

}
