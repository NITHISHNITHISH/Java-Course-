package operators;

import java.util.Scanner;

public class UnitConvertor {

	public static void main(String[] args) {

		UnitConvertor uc =new UnitConvertor();
		
		//uc.convertor1();
		//uc.convertor2();
		uc.convertor3();
		
}

	
	public void convertor1() {
		
		int input;
		int mts;
		int cms;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in cms");
		
		input= scan.nextInt();
		
		mts = (input/100);
		
		cms=input %100;
		
		System.out.println(input+" cms is equal to "+mts+ " meters "+cms+" cms");
	}
	
	public void convertor2() {
		
		int input;
		int kms;
		int mts;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in meters");
		
		input= scan.nextInt();
		
		kms=input/1000;
		
		mts=input%1000;
		
		System.out.println(input+" meters is equal to "+kms+ " kilometers "+mts+" mts");
	}
	
	public void convertor3() {
		
		float input;
		float feet;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in meters");
		
		input= scan.nextFloat();
		
		feet = input/12;
		System.out.printf("%.1f%s%.2f%s",input," feet = " ,feet ,"feets");
	}
	

}
