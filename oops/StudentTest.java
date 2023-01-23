package oops;

import java.util.Scanner;

import oops.Student.Marks;

public class StudentTest {

	public static void main(String[] args) {

		
//		Student s1=new Student();
//		Marks m1=s1.new Marks(35,40,45,35,60);
//		s1.setMarks(m1);
//		s1.setRegNo(1);
//		s1.setName("Nithish");
//		s1.printStudent(s1);
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Total no.of Students ");
		int n=scan.nextInt();
		
		Student[] studentObj = new Student[n];
		
		Marks m;
		
		for(int i=0;i<n;i++) {
			m=studentObj[i].new Marks();
			studentObj[i].setMarks(m);
			m.getMarks();
		}
		
	}

}
