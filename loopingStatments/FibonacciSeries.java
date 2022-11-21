package loopingStatments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int f1=0,f2=1,range;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("series upto :");
		range=scan.nextInt();
		
		if(range>2) {
			System.out.print(f1+"   "+f2+"   ");
		for(int i=3;i<=range;i++) {
			
			int nextNum=f1+f2;
			System.out.print(nextNum+"   ");
			f1=f2;
			f2=nextNum;
			
		}
		}
		else
			System.out.print(f1+"   "+f2);

		
	}

}
