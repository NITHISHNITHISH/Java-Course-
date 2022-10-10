package first;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("First Number before swap\t:" +a);
		System.out.println("Second Number before swap\t:" +b);
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("First Number after swap\t\t:" +a);
		System.out.println("Second Number after swap\t:" +b);
		

	}

}
