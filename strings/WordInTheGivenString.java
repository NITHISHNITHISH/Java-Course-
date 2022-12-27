package strings;

import java.util.Scanner;

public class WordInTheGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input, word;
		char[] charArr ,wordArr;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Sentence  ");

		input = scan.nextLine();

		System.out.println("Enter the Word to Search ");
		word = scan.nextLine();
		
		charArr = new char[input.length()];
		wordArr=new char[word.length()];

		for (int i = 0; i < input.length(); i++) {
			charArr[i] = input.charAt(i);
		}

		for (int i = 0; i < word.length(); i++) {
			wordArr[i] = input.charAt(i);
		}
		int i=0 ,j=0;
		for( ;i<charArr.length;) {
			for(;j<wordArr.length;) {
				
				if(charArr[i] == wordArr[j]) {
					i++;
					j++;
				}
				i++;
				
			}
		}
	}

}
