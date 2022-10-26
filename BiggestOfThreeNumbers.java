package first;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {

		int a=10;
		int b=15;
		int c=5;
		int big =findBig(a,b,c);
		int small=findSmall(a,b,c);
		System.out.println("Value of A,B,C is " + a+"\t"+b+"\t"+c);
		System.out.println("Biggest of A,B,C is "+big);
		System.out.println("Smallest of A,B,C is "+small);
	}
	
	public static int findSmall(int a, int b, int c) {

		int small=0;
		
		if(a<b && a<c)
			small=a;
		if(b<a && b<c)
			small=b;
		else
			small=c;
		
		return small;
	}

	public static int findBig(int a,int b,int c)
	{
		int big=0;
		
		if(a>b && a>c)
			big=a;
		if(b>a && b>c)
			big=b;
		else
			big=c;
		return big;
	}

}
