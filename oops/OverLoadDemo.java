package oops;

public class OverLoadDemo {

	
	
	public void add(int a, int b) {
		
		System.out.println("from 1");
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	public void add(double a,double b) {
		
		System.out.println("from 2");
		System.out.println(a+" "+"+"+ b +" = "+(a+b));
	}
}
