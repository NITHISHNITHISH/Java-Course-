package oops;

public class StaticCar {

	
	private static String name ;
	
	public static void setName(String n) {
		name=n;
	}
	
	
	public static void print() {
		System.out.println("Hiii "+name);
	}
	
}
