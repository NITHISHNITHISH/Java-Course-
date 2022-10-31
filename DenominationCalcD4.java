package first;

import java.util.Scanner;

public class DenominationCalcD4 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Amount:");
		int amount =scan.nextInt();
		
		int amountInt =amount;
		
		int d2000,d500,d100,d50,d10,coins;
		
		 d2000=amount/2000;
		 
		 amount = amount%2000;
		 
		 d500 =amount/500;
		  
		 amount = amount%500;
		 
		 d100=amount/100;
		 
		 amount=amount%100;
		 
		 d50 =amount/50;
		 
		 amount=amount%50;
		 
		 d10=amount/10;
		 
		 amount = amount%10;
		 
		 coins = amount;
		
		
		 Sys
		 
		System.out.printf("%4s%2s%2d%2s%5d\n","2000","*",d2000,"=",(2000*d2000));
		System.out.printf("%4s%2s%2d%2s%5d\n","500","*",d500,"=",(500*d500));
		System.out.printf("%4s%2s%2d%2s%5d\n","100","*",d100,"=",(100*d100));
		System.out.printf("%4s%2s%2d%2s%5d\n","50","*",d50,"=",(50*d50));
		System.out.printf("%4s%2s%2d%2s%5d\n","10","*",d10,"=",(10*d10));
		System.out.printf("%4s%2s%2d%2s%5d\n","1","*",coins,"=",(1*coins));
        System.out.println("-----------------------");
		System.out.printf("%2s%5s%5d","Total","=",amountInt);

	}
}
