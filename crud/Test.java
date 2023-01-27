package crud;

public class Test {

	
	public static void main(String [] args) {
		
		
//		Marks m =new Marks();
//		m.getAllMarks();
//		System.out.println(m.totalCalc(m));
		
		Classroom cr=new Classroom();
		
		cr.addStudent();
		cr.addStudent();
		cr.markEntry(1);
		cr.printAllStudents();
		cr.getStudent(1);
		cr.updateStudent(1);
		cr.deleteStudent(1);
		cr.printAllStudents();
		
		
		
	}
}
