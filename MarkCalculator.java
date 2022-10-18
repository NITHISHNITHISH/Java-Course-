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
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter total no of subjects");
		int totalSubCount=scan.nextInt();
		int sub[]=new int[totalSubCount];
		
		for(int i=0;i<sub.length;i++) {
			
		System.out.println("Enter Subject :"+(i+1)+" Marks :");
		sub[i]=scan.nextInt();
		}
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

