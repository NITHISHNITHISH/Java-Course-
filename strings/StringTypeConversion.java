package strings;

import java.util.Scanner;

public class StringTypeConversion {

	public static void main(String[] args) {

		String input;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String ");

		input = scan.nextLine();
		
		StringTypeConversion tc=new StringTypeConversion();
		System.out.println("Title Case : "+tc.toTitleCase(input));
		System.out.println("Upper Case : "+tc.toUpperCase(input));

	}
	
	public String toTitleCase(String input) {
		
		String result = "";
		
		for(int i=0;i<input.length();i++) {
			if(i==0) {
			result=result+(char)(input.charAt(i)-32);
			}
			else
				result=result+input.charAt(i);

				
		}

		return result;
	}
	
	
	public String toUpperCase(String input) {
		
		String result="";
		for(int i=0 ; i<input.length();i++) {
			
			result=result+(char)(input.charAt(i)-32);
		}
		
		
		
		return result;
		
	}
}
