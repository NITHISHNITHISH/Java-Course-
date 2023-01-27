package crud;

import java.util.Scanner;

public class Marks {

	private int tamilMark;
	private int englishMark;
	private int mathsMark;
	private int scienceMark;
	private int socialMark;
	


	public int getTamilMark() {
		return tamilMark;
	}

	public void setTamilMark(int tamilMark) {
		this.tamilMark = tamilMark;
	}

	public int getEnglishMark() {
		return englishMark;
	}

	public void setEnglishMark(int engMark) {
		this.englishMark = engMark;
	}

	public int getMathsMark() {
		return mathsMark;
	}

	public void setMathsMark(int mathsMark) {
		this.mathsMark = mathsMark;
	}

	public int getScienceMark() {
		return scienceMark;
	}

	public void setScienceMark(int scienceMark) {
		this.scienceMark = scienceMark;
	}

	public int getSocialMark() {
		return socialMark;
	}

	public void setSocialMark(int socialMark) {
		this.socialMark = socialMark;
	}

	Scanner scan = new Scanner(System.in);

	public void getAllMarks() {

		System.out.print("Enter Tamil Mark : ");
		tamilMark = scan.nextInt();

		System.out.print("Enter English Mark : ");
		setEnglishMark(scan.nextInt());

		System.out.print("Enter Maths Mark : ");
		setMathsMark(scan.nextInt());

		System.out.print("Enter Science Mark : ");
		setScienceMark(scan.nextInt());

		System.out.print("Enter English Mark : ");
		setSocialMark(scan.nextInt());

	}

	public int totalCalc() {

		int totalMarks;
		totalMarks = tamilMark +englishMark+mathsMark +scienceMark+socialMark;
		return totalMarks;

	}

	public double percentageCalc(int totalMarks) {
		double percentage;

		return percentage = totalMarks % 5;

	}
}
