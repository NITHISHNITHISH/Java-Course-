package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Classroom {

	Scanner scan = new Scanner(System.in);
	Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

	Student s;

	public boolean addStudent() {
		
		boolean addStatus;
		s = new Student();
		s.getStudentDetails();
		addStatus = studentMap.put(s.getRegNo(), s) != null;
		return addStatus;
	}

	public void getStudent(int regNo) {
		
		s=studentMap.get(regNo);
		System.out.println("Name : "+ s.getName());
		
	}
	
	public void updateStudent(int regNo) {
	
		
		System.out.println("what you want to change ");
		System.out.print("1 - Name ");
		int updateType = scan.nextInt();
		
		switch(updateType) {
		case 1 :
			System.out.print("Enter New Name : ");
			scan.nextLine();
			String name = scan.nextLine();
			updateName(regNo ,name);
		}
		
		
	}

	private void updateName(int regNo, String name) {
		
		s = studentMap.get(regNo);
		s.setName(name);

	}

	public void printAllStudents() {
		System.out.printf("%6s%13s%5s", "Reg_No", "Name ","");
		System.out.println("---------------------------");

		for (Map.Entry m : studentMap.entrySet()) {
			s = (Student) m.getValue();
			System.out.printf("%5d%10s\n", s.getRegNo(), s.getName());

		}
	}
	
	public void deleteStudent(int regNo) {
		
		studentMap.remove(regNo);
	}

	public void markEntry(int regNo) {
		
		s = studentMap.get(regNo);
		s.m.getAllMarks();
		System.out.println(s.m.toString());
	}








}







