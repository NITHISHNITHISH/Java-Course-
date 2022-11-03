package operators;

import java.util.Scanner;

public class UnitConvertor {

	public static void main(String[] args) {

		UnitConvertor uc =new UnitConvertor();
		
		//uc.convertor1(); // cms to meters 
		uc.convertor2(); // meters to kilometers
		//uc.convertor3(); // inches to feet
		//uc.convertor4(); // sqft to cent 
		//uc.convertor5(); // grams to kgs
		//uc.convertor6(); // rupees to dollar
		//uc.convertor7(); // fahrenheit to celsius
		
}

	
	public void convertor1() {
		
		int input;
		int mts;
		int cms;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("centimetre to Meter Convertion");
		System.out.print("Enter value in cms");
		
		input= scan.nextInt();
		
		mts = (input/100);
		
		cms=input %100;
		
		System.out.println(input+" cms is equal to "+mts+ " meters "+cms+" cms");
		
		System.out.println("Metre to Centimetre Convertion");
		System.out.print("Enter value in meters");
		
		input= scan.nextInt();
		
		cms=input *100;
		
		System.out.println(input+" mts = "+cms+" cms");
	}
	
	public void convertor2() {
		
		double input,kms,mts;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Meter to Kilometer conversion");
		System.out.print("Enter value in meters ");
		input= scan.nextInt();
		kms=(int)input/1000;
		mts=input%1000;
		System.out.println(input+" meters is equal to "+kms+ " kilometers "+mts+" mts");
		
		
		System.out.println("Meter to Kilometer conversion");
		System.out.print("Enter value in meters ");
		input= scan.nextInt();
		mts=input*1000;
		System.out.println(input+" meters = "+mts+" mts");
	}
	
	public void convertor3() {
		
		float input;
		float feet;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in feet");
		
		input= scan.nextFloat();
		
		feet = input/12;
		System.out.printf("%.1f%s%.2f%s",input," feet = " ,feet ,"feets");
	}
	
	public void convertor4() {
		
		double input,cent,sqft;  // 1cent = 435.556 sqft
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in sqft");
		
		input= scan.nextFloat();
		
		cent = input*0.0023;
		System.out.printf("%.2f%s%.2f%s",input," sqft = " ,cent ,"cents");
	}
	

	public void convertor5() {
	
		float input;
		int kgs;
		float gms;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in grams");
		
		input= scan.nextFloat();
		
		kgs = (int) (input/1000);
		gms = input%1000;
		System.out.println(input+" grams ="+kgs+" kgs "+gms+" gms");
	}

	public void convertor6() {
		
		double input,rupees,dollar;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in rupees");
		
		input= scan.nextFloat();
		
		dollar=input*76.75;
		System.out.println(input+" rupees ="+dollar+" dollars");
	}
	
	public void convertor7() {
		
		double input,fahrenheit,celsius; // 1 celsius = 33.8F
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value in celsius");
		
		input= scan.nextDouble();
		
		fahrenheit=(input-32)*5/9;
		System.out.printf("%.4f",fahrenheit);
	}
	
}
