package Pattern;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int incre;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter No of Rows");
		int rows =scan.nextInt();
		System.out.println("Increment");
		incre =scan.nextInt();
		for(int i=1;i<=rows;i++) {
			int a=1;
			for(int j=1;j<=i;j++) {
				System.out.print(a);
				a=a+incre;
			}
			
			System.out.println();	
		}
		
		
		
		
	}

}
