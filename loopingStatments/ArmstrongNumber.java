package loopingStatments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num,result=0,temp;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Number : ");
		num=scan.nextInt();
		temp=num;
		while(num>0) {
			result =(int) (result+Math.pow((num%10),3));
			num=num/10;
		}
		if(result == temp) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not Armstrong Number");
	}

}
