package strings;

import java.util.Scanner;

public class NthPositionOfCharacter {

	public static void main(String[] args) {

		String input;
		char element;
		int pstart =0 ,position = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String ");
		input = scan.nextLine();
		
		System.out.println("Enter the Character ");
		element = scan.next().charAt(0);
		System.out.println("Enter the Starting position ");
		pstart = scan.nextInt();
		
		NthPositionOfCharacter npc = new NthPositionOfCharacter();
	
		position =npc.positionFinder1(input, element, pstart);
	
		if(position !=0) {
			System.out.println(element+" is found in the "+position+" after "+pstart+" th position");
		}
		else
			System.out.println("Not found ");

		
	}
	
	public int positionFinder1(String input,char element, int pstart) {
		
		
		int position =0;
		
		for(int i=pstart+1;i<input.length();i++) {
			if(input.charAt(i)== element ) {
				position = i;
				break;
			}
		}
		
		return position;
	}
}
