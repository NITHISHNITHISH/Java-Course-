package oops;

import java.util.Scanner;

public class AdvanceCalculator extends Calculator {

	public AdvanceCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	Calculator c = new Calculator();

	char operator = '+';

	protected void getData() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First number : ");
		c.setA(scan.nextInt());
		System.out.print("Enter Second number : ");
		c.setB(scan.nextInt());
		System.out.print("Enter your choice \n Addition(+)\n subtraction(-)\n multiplication(*)\n division(/)");
		operator = scan.next().charAt(0);

	}

	protected void calculate() {

		switch (operator) {
		case ('+'):
			c.addition();
			break;
		case ('-'):
			c.subtraction();
			break;
		case ('*'):
			multiplication();
			break;
		case ('/'):
			division();
			break;

		default:
			System.out.println("Enter valid operator ");
			break;
		}
	}

	private void multiplication() {
		System.out.println("Result of " + c.getA() + " * " + c.getB() + " is : " + (c.getA() * c.getB()));
	}

	private void division() {
		System.out.println("Result of " + c.getA() + " / " + c.getB() + " is : " + (c.getA() / c.getB()));
	}
}
