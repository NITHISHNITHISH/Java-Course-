package strings;

import java.util.Scanner;

public class StringTypeConversion {

	public static void main(String[] args) {

		String input;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String ");

		input = scan.nextLine();
		
		StringTypeConversion tc=new StringTypeConversion();
		
		if(tc.inputValidator(input)) {
			System.out.println("Invaild Input");
		}
		else {
		//System.out.println("Title Case : "+tc.toTitleCase(input));
		System.out.println("Upper Case : "+tc.toUpperCase(input));
		//System.out.println("To Lower Case :"+);
		}

	}
	
	
	public boolean inputValidator(String input) {
		
		boolean flag;
		
		for(int i=0 ; i<input.length();i++) {
			if((input.charAt(i)>= 'A' || input.charAt(i)<='Z') || 
					(input.charAt(i)<='a' || input.charAt(i)>='z') ) {
				;
			}
		
		}
		return false;
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
			if(input.charAt(i)>=65 && input.charAt(i)<=90) {
				result=result+input.charAt(i);
			}
			else {
			result+=(char)(input.charAt(i)-32);
			}
		}
		
		
		
		return result;
		
	}
}
