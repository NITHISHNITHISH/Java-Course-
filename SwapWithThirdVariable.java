package first;

public class SwapWithThirdVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int temp;
		System.out.println("First Number before swap\t:" +a);
		System.out.println("Second Number before swap\t:" +b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("\nFirst Number after swap\t\t:" +a);
		System.out.println("Second Number after swap\t:" +b);
		

	}

}
