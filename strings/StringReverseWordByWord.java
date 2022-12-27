package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverseWordByWord {

	public static void main(String[] args) {

		String input;
		String[] words;
		String[] revWords;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the sentence ");

		input = scan.nextLine();

		StringReverseWordByWord rw = new StringReverseWordByWord();

		words = rw.sentenceSpliter(input);
		revWords = new String[words.length];
		
		for(int i=0 ;i<words.length;i++) {
			revWords[i] =  rw.wordReverser(words[i]);
		}
		
		System.out.println(Arrays.toString(revWords));
	}

	public String[] sentenceSpliter(String input) {

		int wordCounter = 1;
		String[] words;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				wordCounter++;
			}
		}
		words = new String[wordCounter];
		String temp = "";
		int k = 0;
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) != ' ') {
				temp += input.charAt(i);
			} else {
				words[k] = temp;
				System.out.println(words[k]);
				k++;
				temp = "";
			}

		}

		words[k] = temp;

		return words;

	}
	
	public static String wordReverser(String input) {
		char [] charArr = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {

			charArr[i] = input.charAt(i);
		}

		int length = charArr.length;
		int check = length % 2 == 0 ? (length / 2) : ((length-1) / 2) ;
		for (int i = 0; i < check; i++) {

			char temp = charArr[i];
			charArr[i] = charArr[length - 1 - i];
			charArr[length - 1 - i] = temp;
		}
		String temp = "";
		for(int i =0 ; i<charArr.length;i++) {
			temp +=charArr[i];
		}
		return temp;
	}

}
