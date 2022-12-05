package strings;

import java.util.Scanner;

public class NthPositionOfCharacter {

	public static void main(String[] args) {

		String input;
		char element;
		int first,last;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String ");
		input = scan.nextLine();
		
		System.out.println("Enter the Character ");
		element = scan.next().charAt(0);
		
		
		
		NthPositionOfCharacter pc=new NthPositionOfCharacter();
		 first =pc.positionFinder(input,element);
		last =pc.positionFinder1(input,element);

		if(first != 0) {
			System.out.println("Starting position the character is : "+first);
			System.out.println("Last position the character is : "+last);
		}
		
		else
			System.out.println("No Such character found in the String");
	}
	
	public int positionFinder(String input,char element) {
		
		
		int position =0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)== element)
				return i;
			
		}
		
		return position;
	}
public int positionFinder1(String input,char element) {
		
		
		int position =0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)== element)
				position =i;
			
		}
		
		return position;
	}

}
