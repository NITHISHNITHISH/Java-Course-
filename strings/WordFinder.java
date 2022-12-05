package strings;

import java.util.Arrays;
import java.util.Scanner;

public class WordFinder {

	public static void main(String[] args) {


		String input , word ;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String ");

		input = scan.nextLine();
		
		System.out.println("Enter the Word for search");
		
		word = scan.nextLine();
		String[] arr = input.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
		
		for(int i=0 ; i<arr.length;i++) {
			
			if(arr[i]==word) {
				System.out.println("Given Word "+word+"present in the Sentence");
				break;
			}
			
		}
		
	
	}

}
