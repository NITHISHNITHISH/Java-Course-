package strings;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {

		String str1,str2;
		boolean result;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st String :");
		str1=scan.nextLine();
		
		System.out.print("Enter 2nd String :");
		str2=scan.nextLine();
		
		StringComparision sc = new StringComparision();
		
		result = sc.isEqual(str1, str2);
		
		System.out.println(result ? "Equal " : "Not Equal");

	}
	
	public boolean isEqual(String str1,String str2) {
		
		
		if(str1.length() != str2.length())
			return false;
		
		
		for(int i=0 ; i<str1.length();i++) {
			if(str1.charAt(i) != str2.charAt(i))
				return false;
		}
		
		return true;
	}

}
