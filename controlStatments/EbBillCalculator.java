package controlStatments;

import java.util.Scanner;

public class EbBillCalculator {

	public static void main(String[] args) {

		EbBillCalculator eb =new EbBillCalculator();
		eb.billCalc();	
	}
	
	public void billCalc() {
		
		double unit,billAmount;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter total unit consumed : ");
		
		unit=scan.nextDouble();
		
		if(unit >0 &&unit<100) {
			System.out.println("No Bill ");
		}
		else if(unit>100 && unit<=300)
		{
			billAmount=unit*2.50;
			System.out.println("Your bill amount is "+billAmount);
		}
		else if(unit>300 && unit<=500)
		{
			billAmount=unit*3;
			System.out.println("Your bill amount is "+billAmount);
		}
		else if(unit>500 && unit<=1000)
		{
			billAmount=unit*5;
			System.out.println("Your bill amount is "+billAmount);
		}
		else if(unit>1000)
		{
			billAmount=unit*7;
			System.out.println("Your bill amount is "+billAmount);
		}
		else
			System.out.println("please enter correct value of unit consumed");
		

	}
}
