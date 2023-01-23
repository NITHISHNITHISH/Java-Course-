package oops;

public class TempEmployee extends Employee {

	
	
	TempEmployee(){
		System.out.println("Constructor from Child Class");
	}
	

	public void setTempEmployee(int id, String name,int earnedLeave ,double wage) {
		super.setId(id);
		super.setName(name);
		super.setEarnedLeave(earnedLeave);	
		super.setWage(wage);
	}

	public void printTempEmployee() {
		
		System.out.println("Id : "+super.getId());
		System.out.println("Name : "+super.getName());
		System.out.println("Salary : "+super.getSalary());
		System.out.println("PF : "+super.getPf());
	}
	
	
	
	protected void pfCalc() {
		
		System.out.println("No Pf for Temp Employees ");
		
		super.setPf(0.05 * super.getSalary());
		
	}
	
}
