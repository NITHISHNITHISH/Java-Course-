package loopingStatments;

import java.util.Scanner;

public class PrimeNumbersBwRange {

	public static void main(String[] args) {

		
		PrimeNumbersBwRange pn =new PrimeNumbersBwRange();
		int start,end;
		boolean result;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Starting Range :");
		start=scan.nextInt();
		System.out.println("Enter Ending Range :");
		end=scan.nextInt();
		
		for( ;start<=end;start++) {
			
			result=pn.PrimeFinder(start);
			if(result)
				System.out.print(start+"\t");
		}
		
		
	}
	
	public boolean PrimeFinder(int num) {
		int count=0;
		
		for(int i=2;i<=num;i++)
		{
			if(num%i ==0)
			{
				count++;
				if(count>1) {
					return false;
				}
			}
			
		}
		return true;
		
	}
}