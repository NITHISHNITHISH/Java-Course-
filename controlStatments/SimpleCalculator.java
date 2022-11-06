package controlStatments;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		SimpleCalculator sc=new SimpleCalculator();
		sc.Calc();
		
	}
	
	public void Calc() {
		
		double a,b,result;
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your choice \n Addition(+)\n subtraction(-)\n multiplication(*)\n division(/)"
				+ "\n modulo division(%)\n");
		ch=scan.next().charAt(0);
		System.out.print("first Number : ");
		a=scan.nextDouble();
		System.out.print("second Number: ");
		b=scan.nextDouble();
		
		switch(ch) {
			case ('+'):
				result=a+b;
				System.out.println("Addition of two numbers : "+result);
				break;
			case ('-'):
				result=a-b;
			System.out.println("Subtraction of two numbers : "+result);
			   	break;
			case ('*'):
				result=a*b;
			System.out.println("Multiplication of two numbers : "+result);
				break;
			case ('/'):
				result=a/b;
			System.out.println("Division of two numbers :"+result);
				break;
			case ('%'):
				result=a%b;
			System.out.println("Modulo Divion of two numbers :"+result);
				break;
			default :
				System.out.println("Enter valid operator ");
				break;
		}
		
		
		
	}

}
