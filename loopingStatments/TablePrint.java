package loopingStatments;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {

		TablePrint tp=new TablePrint();
		tp.TablePrinter();
	}
	
	public void TablePrinter() {
		int n,range;
		Scanner scan = new Scanner(System.in);
		System.out.println("Multiplication table for ? ");
		n=scan.nextInt();
		System.out.println("Enter the range ");
		range=scan.nextInt();
		System.out.println("Multiplication table for "+n);
		for(int i=1;i<=range;i++) {
			
			System.out.printf("%2d%s%2d%s%4d \n",i," *",n," =",(i*n));
			
	}
}
}
