package crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {

	private int regNo;
	private String name;

	Scanner scan = new Scanner(System.in);
	Marks m;

	Student() {
		m = new Marks();
	}

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

	public Student getStudentDetails() {
		Student std = new Student();
		System.out.print("Enter Reg no : ");
		regNo = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Name : ");
		name = scan.nextLine();

		return std;
	}

}
