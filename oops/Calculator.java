package oops;

public class Calculator {

	private int a;
	private int b;
	


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public void addition() {
		
		System.out.println("Result of "+a+" + "+b+" is : "+(a+b));
	}
	
	
	protected void addition(double a, double b) {
		System.out.println("Result of "+a+" + "+b+" is : "+(a+b));
	}
	
	protected void subtraction() {
		
		System.out.println("Result of "+a+" - "+b+" is : "+(a-b));
	}
}
