package strings;

import java.util.Scanner;

public class PositionOfCharacter {

	public static void main(String[] args) {

		String input;
		char element;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String ");
		input = scan.nextLine();
		
		System.out.println("Enter the Character ");
		element = scan.next().charAt(0);
		
		PositionOfCharacter pc=new PositionOfCharacter();
		int position =pc.positionFinder(input,element);
		if(position != 0)
			System.out.println("Position of the character is : "+position);
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

}
