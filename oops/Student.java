package oops;

import java.util.Scanner;

public class Student {

	private int regNo;
	private String name;
	private Marks marks;

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public int totalCalc() {
		int totalMarks = marks.tamil + marks.english + marks.maths + marks.science + marks.social;
		return totalMarks;
	}
	
	public void printStudent(Student student) {
		
		System.out.printf("%3d%10s%4d",this.getRegNo(),this.getName(),this.totalCalc());
		
	}
	
	public class Marks {
		private int tamil;
		private int english;
		private int maths;
		private int science;
		private int social;

		public int getTamil() {
			return tamil;
		}

		public void setTamil(int tamil) {
			this.tamil = tamil;
		}

		public int getEnglish() {
			return english;
		}

		public void setEnglish(int english) {
			this.english = english;
		}

		public int getMaths() {
			return maths;
		}

		public void setMaths(int maths) {
			this.maths = maths;
		}

		public int getScience() {
			return science;
		}

		public void setScience(int science) {
			this.science = science;
		}

		public int getSocial() {
			return social;
		}

		public void setSocial(int social) {
			this.social = social;
		}

		
		
		Scanner scan = new Scanner(System.in);
		
		public void getMarks() {
			System.out.println("Enter Tamil Mark :");
			setTamil(scan.nextInt());
			
			System.out.println("Enter English Mark :");
			setEnglish(scan.nextInt());
			
			System.out.println("Enter Maths Mark :");
			setMaths(scan.nextInt());
			
			System.out.println("Enter Science Mark :");
			setScience(scan.nextInt());
			
			System.out.println("Enter Social Mark :");
			setSocial(scan.nextInt());
		}

	}

}
