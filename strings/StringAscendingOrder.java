package strings;

import java.util.Scanner;

public class StringAscendingOrder {

	public static void main(String[] args) {

		String str ;
		char [] input;
		Scanner scan = new Scanner(System.in);
		
		str =scan.nextLine();
		
		input=new char[str.length()];
		
		for(int i=0;i<input.length;i++) {
			input[i]=str.charAt(i);
		}
		char temp;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
			if(input[i]<input[j]) {
				temp = input[i];
				input[i]=input[i-1];
				input[i-1]=temp;
			}
			}
		}
		for(int i=0;i<input.length;i++) {
		System.out.print(input[i]);
		}
	}

}
