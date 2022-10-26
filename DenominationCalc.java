package first;

import java.util.Scanner;

public class DenominationCalc{

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int amount;
		System.out.print("Please Enter the Amount :");
		amount=scan.nextInt();
		int [] denomination = {2000,500,100,50,10,1};
		int [] count =denominationCalc(amount,denomination);
		printDenomination(count,denomination);
		
		scan.close();
	}
	
	
	public static int[] denominationCalc(int amount,int [] denomination) {
			
		int [] count=new int [6];
		
		for(int i=0;i<denomination.length;i++) {
			
			count[i]=amount/denomination[i];
			
			amount= amount- count[i]*denomination[i];
			
			
		}	
	return count;	
	}

	public static void printDenomination(int[]count,int[]denomination) {
		for(int i=0;i<count.length;i++) {
	
		System.out.println(denomination[i]+"*"+count[i]+"="+denomination[i]*count[i]);
		}
	}
}
