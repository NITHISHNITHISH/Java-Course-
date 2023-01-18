package oops;

public class Student {

	int regNo;
	String name;
	int totalMarks;
	double percentage;
	
	
	void percentageCalc() {
		
		percentage = (totalMarks/5);
		System.out.println(name+" ,your percentile of marks is : "+percentage+" %");
	}
	
	
}
