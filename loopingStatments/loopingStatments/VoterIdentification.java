package loopingStatments;

import java.util.Scanner;

public class VoterIdentification {

	public static void main(String[] args) {

		VoterIdentification ec=new VoterIdentification();
		ec.eligiblityChecker();
		
	}

	public void eligiblityChecker() {
		
		char repeat='N';
		int maleCounter=0,femaleCounter=0,overallEligible=0,eligibleMale=0,
				eligibleFemale=0;
		String name;
		char gender;
		int age;
		do {
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the below Details");
			System.out.print("Name :");
			name=scan.nextLine();
			do	{
				
				System.out.print("Gender : 'M' for Male, 'F' for female ");
				gender=scan.next().charAt(0);
				if(gender != 'M' && gender != 'F')
					System.out.println("Enter valid gender Details ");
				}while(gender !='M' && gender !='F');
			System.out.print("Age");
			age=scan.nextInt();
			
			
		if(age>18) {
			if(gender=='M')
			{
				maleCounter++;
				overallEligible++;
				eligibleMale++;
				System.out.println("Mr."+name);
			}
			else 
			{
				femaleCounter++;
				overallEligible++;
				eligibleFemale++;
				System.out.println("Ms/Mrs."+name);
			}
				
		}	
			
		else
		{
			if(gender =='M') {
				maleCounter++;
			}
			else
				femaleCounter++;
			System.out.println(gender == 'M' ? "Mr" : "Ms/Mrs ."+name +" is not eligible to vote");
		}
				
		System.out.println("Continue : [Y/N]");
		repeat=scan.next().charAt(0);
		}while(repeat == 'Y');
		
		
		
		System.out.println("Male \t\t\t:"+maleCounter);
		System.out.println("female \t\t:"+femaleCounter);
		System.out.println("OverallEligiblity count :"+overallEligible);
		System.out.println("Eligible Male \t\t\t:"+eligibleMale);
		System.out.println("Eligible Female \t:"+eligibleFemale);	
		
	}
	
}
