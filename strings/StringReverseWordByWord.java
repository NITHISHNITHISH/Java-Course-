package strings;

import java.util.Scanner;

public class StringReverseWordByWord {

	public static void main(String[] args) {

		
		String input;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the sentence ");

		input = scan.nextLine();
		
		String [] stringArr=input.split(" ");
		StringReverseWordByWord sr =new StringReverseWordByWord();

		for(int i=0;i<stringArr.length;i++) {
			
			System.out.print(sr.reverser(stringArr[i]) +" ");
				
		}
		
	}
	
	public String reverser(String input) {

		String result="";
		
		for(int i=(input.length()-1) ; i>=0;i--) {
			result = result+ (char)input.charAt(i);
		}
		
		return result;
	}

}
