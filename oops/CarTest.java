package oops;

public class CarTest {

	public static void main(String[] args) {

		
		

		StaticCar.setName("Nithish");
		StaticCar.print(); // Nithish 
		
		StaticCar sc=new StaticCar();
		sc.setName("nk"); 
		StaticCar.print(); // nk
		
		StaticCar sc1=new StaticCar();
		sc1.setName("sk");
		StaticCar.print(); // sk
		
		sc.print(); // sk
		
		/*Student s1 =new Student();
		s1.setName("Nithish");
		System.out.println(s1.getName());
		
		Student s2 =new Student();
		s2.setName("Nk");
		System.out.println(s2.getName());
		
		System.out.println(s1.getName()); // Nithish */

		
		
	}

}
