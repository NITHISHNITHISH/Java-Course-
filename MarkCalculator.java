package first;

import java.util.Scanner;

public class MarkCalculator 
{
	public static void main(String[] args) {
		
		int subjects[]=getMarks();
		int total=totalMarks(subjects);
		int average=averageCal(subjects,total);
		int percentage=percentageCal(subjects,total);
		
		valuePrint(total,average,percentage);

	}

	public static int[] getMarks() {
		
		int sub[]=new int[5];
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter Subject 1 Marks :");
		sub[0]=scan.nextInt();
		
		
		System.out.println("Enter Subject 2 Marks :");
		sub[1]=scan.nextInt();
		
		System.out.println("Enter Subject 3 Marks :");
		sub[2]=scan.nextInt();
		
		System.out.println("Enter Subject 4 Marks :");
		sub[3]=scan.nextInt();
		
		System.out.println("Enter Subject 5 Marks :");
		sub[4]=scan.nextInt();
		
		return sub;
	}
	
	public static int totalMarks(int sub[]) {
		int sum=0;
		for(int i=0;i<sub.length;i++) {
			sum=sum+sub[i];
		}
		return sum;
			
	}
	public static int averageCal(int sub[],int sum) {
		int average=0;
		
		average=sum/sub.length;
		return average;
	}
	
	public static int percentageCal(int sub[],int sum) {
		
		int percentage ;
		
		int maxMarks=sub.length*100;
		percentage=(sum/maxMarks)*100;
		
		return percentage;
	}
	
	public static void valuePrint(int total,int avg,int percentage) {
		
		System.out.println("Your Total Marks is : "+total);
		System.out.println("Your average is : "+avg);
		System.out.println("Your Percentage : "+percentage + "");
		
		
	}
	
}

