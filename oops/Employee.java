package oops;

public class Employee {

	private int id;
	private String name;
	private int earnedLeave;
	private double wage;
	private double salary;
	private double pf;

	Employee() {
		System.out.println("Constructor from Parent Class ");
	}

	public int getEarnedLeave() {
		return earnedLeave;
	}

	public void setEarnedLeave(int earnedLeave) {
		this.earnedLeave = earnedLeave;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	protected void salaryCalc(int workingDays, int leave) {

		earnedLeave -= leave;

		if (earnedLeave > 0) {

			setSalary(workingDays * wage);
		}

		else {
			setSalary((workingDays - leave) * wage);
		}

	}

	protected void pfCalc() {
			
		setPf((1/10)*getSalary());
		
	}

	

}
