package strings;

import java.util.Scanner;

public class SubStringByPosition {

	public static void main(String[] args) {
		
		int start, end;
		String input,output;
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		input =scan.nextLine();
		System.out.print("Enter Starting Index of Substring : ");
		start =scan.nextInt();
		System.out.print("Enter Ending Index of Substring : ");
		end =scan.nextInt();
		
		output=trimmer(input, start, end);
		
		System.out.println("SubString : "+output);

	}

	public static String trimmer(String input , int start , int end) {
		
		String sub ="";
		char [] charArr = new char[input.length()];
		for(int i=0;i<charArr.length;i++) {
			charArr[i]=input.charAt(i);
		}
		
		for(int i=start ; i<=end ;i++) {

			sub+=charArr[i];
		
		}
		
		return sub;
	}
}
