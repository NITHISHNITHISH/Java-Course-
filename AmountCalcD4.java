package first;

import java.util.Scanner;

public class AmountCalcD4 {

	public static void main(String[] args) {

		int d2000,d500,d200,d100,d50,d10;
		Scanner scan = new Scanner(System.in);
		

		System.out.print("2000\t=");
		d2000=scan.nextInt();
		
		System.out.print("500\t=");
		d500=scan.nextInt();

		System.out.print("200\t=");
		d200=scan.nextInt();

		System.out.print("100\t=");
		d100=scan.nextInt();

		System.out.print("50\t=");
		d50=scan.nextInt();

		System.out.print("10\t=");
		d10=scan.nextInt();
		
		System.out.printf("%4s%2s%3d\n","2000","=",d2000);
		System.out.printf("%4s%2s%3d\n","500","=",d500);
		System.out.printf("%4s%2s%3d\n","200","=",d200);
		System.out.printf("%4s%2s%3d\n","100","=",d200);
		System.out.printf("%4s%2s%3d\n","50","=",d50);
		System.out.printf("%4s%2s%3d\n","10","=",d10);
		
		int amount =(2000*d2000)+(500*d500)+(200*d200)+(100*d100)+(50*d50);
		
		System.out.println("total amount for the above denominations : "+amount);

	}

}
