package controlStatments;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {

		BiggestOfThreeNumbers btn=new BiggestOfThreeNumbers();
		int big,small;
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter 1st Number :");
		a=scan.nextInt();
		System.out.print("Enter 2st Number :");
		b=scan.nextInt();
		System.out.print("Enter 3st Number :");
		c=scan.nextInt();
	
		big=btn.findBig(a, b, c);
		small=btn.findSmall(a, b, c);
		System.out.println("Value of A,B,C is " + a+"\t"+b+"\t"+c);
		System.out.println("Biggest of A,B,C is "+big);
		System.out.println("Smallest of A,B,C is "+small);
	}
	
	
	
	public int findSmall(int a, int b, int c) {

		int small=0;
		
		if(a<b && a<c)
			small=a;
		if(b<a && b<c)
			small=b;
		else
			small=c;
		
		return small;
	}

	public  int findBig(int a,int b,int c)
	{
		int big=0;
		
		if(a>b && a>c)
			big=a;
		if(b>a && b>c)
			big=b;
		else
			big=c;
		return big;
	}

}
