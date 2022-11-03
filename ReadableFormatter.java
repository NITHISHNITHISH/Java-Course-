package operators;

import java.util.Scanner;

public class ReadableFormatter {

	public static void main(String[] args) {

		ReadableFormatter rd=new ReadableFormatter();
		rd.format();
	}
	
	public void format() {
		
		Scanner scan = new Scanner(System.in);
		float input,cms;
		int kms,mts,ft;
		System.out.print("Enter the value");
		input = scan.nextFloat();
		float temp=input;
		kms = (int) (input/1000);
		input=input%1000;
		
		mts =(int) (input/100);
		input=input%100;
		
		ft=(int) (input/30);
		input=input%10;
		
		cms=input;
		
		System.out.println("Input : "+temp +" ="+kms+" kilometers "+mts+" meters "+ft+" fts "+cms+" cms");
		
	}

}
