package Pattern;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			int a=1;
			for(int j=i;j<num;j++) {
				System.out.print(" ");
				a++;
			}
			for(int j=num;j<=num;j++) {
				
				System.out.print(j);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
		System.out.println("");	
		}
		
		
		
		
		
		
		
		
	}

}
