package loopingStatments;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scan.nextInt();
		int temp = num;
		int result = 0;
		
		while(num>0) {
			result=result+factorialFinder(num%10);
			num /=10;
		}
		if(result == temp)
			System.out.println("Strong number");
		else
			System.out.println("Not a Strong number");
		
	}

	public static int factorialFinder(int num) {
		int result=1;
		
		if(num>=0) {
		while(num!=0) {
			result=result*num;
			num --;
			}
		}
		return result;
	}
}
