package first;

public class Person{

	public static void main(String[] args) {
		String name = "Nithish";
		String gender ="Male";
		String dob ="10/06/1998";
		int age= 25;
		String maritalStatus ="Unmarried";
		int doorNumber=18;
		String street="3rd Cross Street";
		String locality ="Chennai";
		String city ="Chennai";
		String state="Tamilnadu";
		String country ="India";
		int pinCode =600002;
		boolean isAadharAvailable =true;
		boolean isTelephoneAvailable =true;
		long phoneNumber=8825677796L;
		String qualification ="Engineering";
		boolean isSalaried =true;
		int monthlySalary =20000;
		int monthlyExpense = 2300;
		String hobbies ="Playing Shuttle";

		
		System.out.println("Name\t\t\t: "+name);
		System.out.println("Gender\t\t\t: "+gender);
		System.out.println("Date of Birth\t\t: "+dob);
		System.out.println("Age\t\t\t: "+age);
		System.out.println("maritalStatus\t\t: "+maritalStatus);
		System.out.println("doorNumber\t\t: "+doorNumber);
		System.out.println("Street\t\t\t: "+street);
		System.out.println("Locality\t\t: "+locality);
		System.out.println("City\t\t\t: "+city);
		System.out.println("State\t\t\t: "+state);
		System.out.println("Country\t\t\t: "+country);
		System.out.println("PinCode\t\t\t: "+pinCode);
		if(isAadharAvailable ==true)
		System.out.println("IsAadharAvailable\t: Available");
		else
		System.out.println("IsAadharAvailable\t: Not Available");
		if(isTelephoneAvailable ==true)
		System.out.println("IsTelephoneAvailable\t: Available" );
		else
		System.out.println("IsTelephoneAvailable\t: Not Available");
		System.out.println("phoneNumber\t\t: "+phoneNumber);
		System.out.println("Qualification\t\t: "+qualification);
		if(isSalaried==true)
		{
			System.out.println("IsSalaried\t\t: YES");
			System.out.println("monthlySalary\t\t: "+monthlySalary);
		}
		else
			System.out.println("IsSalaried\t\t: NO");
		System.out.println("monthlyExpense\t\t: "+monthlyExpense);
		System.out.println("Hobbies\t\t\t: "+hobbies);
		
	}

}
