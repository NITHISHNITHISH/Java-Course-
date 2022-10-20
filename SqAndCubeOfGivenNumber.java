package first;

import java.util.Scanner;

public class SqAndCubeOfGivenNumber {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=scan.nextInt();
		System.out.println("you have entered :"+num);
		int square=(int) Math.pow(num,2);
		int cube =(int)Math.pow(num,3);
		
		System.out.println("Square of "+num+" is :"+square);
		System.out.println("Square of "+num+" is :"+cube);

	}

}
