package loopingStatments;

import java.util.Scanner;

public class TotalAndAverage {

	public static void main(String[] args) {

		int range,total=0;
		double average;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Range ");
		range = scan.nextInt();
		
		int i=0;
		while(i<=range) {
			total =total+i;
			i++;
		}
		System.out.println("Total : "+total);
		average = (double)total/(i-1);
		System.out.printf("%s%.4f","Average : ",average);
	}

}
