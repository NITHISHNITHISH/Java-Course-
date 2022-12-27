package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		String input;
		char[] charArr;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String "); // Strying   g n i  y   r t s

		input = scan.nextLine();

		charArr = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {

			charArr[i] = input.charAt(i);
		}

		int length = charArr.length;
		
		int check = length % 2 == 0 ? (length / 2) : ((length -1)/ 2);
		
		char temp ;
		for (int i = 0 ; i < check; i++) {

			temp = charArr[i];
			charArr[i] = charArr[length - 1 - i];
			charArr[length - 1 - i] = temp;
		}
		
		
	}

}
