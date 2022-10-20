package first;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter side of the Square");
		int side=scan.nextInt();
		int area = side*side;
		System.out.println("Area of the Square :"+area);
		

		

	}

}
