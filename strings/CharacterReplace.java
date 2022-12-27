package strings;

import java.util.Scanner;

public class CharacterReplace {

	public static void main(String[] args) {

		String input;
		char element,replace;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String ");
		input = scan.nextLine();
		
		System.out.println("Enter a Character ");
		element=scan.next().charAt(0);
		
		System.out.println("Replaced with : ");
		replace	=scan.next().charAt(0);
		
		CharacterReplace cr =new CharacterReplace();
		boolean status =cr.replacer(input,element,replace);
		
		System.out.println(status ? "Updation Done" : "No Such Character ");
	}
	
	public boolean replacer(String input , char element,char replace) {
		
		

		char [] charArr = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {

			charArr[i] = input.charAt(i);
		}
		
		for(int i=0 ; i<charArr.length;i++) {
			if(charArr[i] == element) {
				charArr[i] = replace;
				return true;
			}
		}
		return false;
	}

}
