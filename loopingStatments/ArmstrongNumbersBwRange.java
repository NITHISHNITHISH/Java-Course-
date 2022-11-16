package loopingStatments;

import java.util.Scanner;

public class ArmstrongNumbersBwRange {

	public static void main(String[] args) {

		int start,end;
		ArmstrongNumbersBwRange am=new ArmstrongNumbersBwRange();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter Starting Range :");
		start=scan.nextInt();
		System.out.println("Please enter End Range :");
		end=scan.nextInt();
		System.out.println("Armstrong numbers between "+start+" and "+end);
		while(start<end) {
		am.ArmstrongFinder(start);
		start++;
		}
	}
	
	public void ArmstrongFinder(int num) {
		
		
		int result=0,temp;
		
		temp=num;
		while(num>0) {
			result =(int) (result+Math.pow((num%10),3));
			num=num/10;
		}
		if(result == temp) {
			System.out.print(result+"\t");
		}
		
	}

}
