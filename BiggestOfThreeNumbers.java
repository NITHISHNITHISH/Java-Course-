package operators;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {

		int a,b,c,d,big,small;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter 1st Number :");
		a=scan.nextInt();
		System.out.print("Enter 2nd Number :");
		b=scan.nextInt();
		System.out.print("Enter 3rd Number :");
		c=scan.nextInt();
		
		d= a>b ? a:b;
		
		big = d>c ? d:c;
		
		d=a<b ? a : b;
		
		small = d<c? d:c;
		
		System.out.println("Biggest of "+a+","+b+","+c+" is "+big);
		System.out.println("Smallest of "+a+","+b+","+c+" is "+small);

		
		
	}

}
