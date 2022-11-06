package controlStatments;

import java.util.Scanner;

public class LetterCaseFinder {

	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		char ch;
		System.out.println("Enter a Alphabet ");
		ch=scan.next().charAt(0);
		
		if(ch >= 65 && ch<=90 ) {
			System.out.println("Given Character is in UPPERCASE");
			}
		if(ch>=97 && ch<=122) {
			System.out.println("Given Character is in lowercase");
		}
		else
			System.out.println("Not a Letter");
		
	}

}
