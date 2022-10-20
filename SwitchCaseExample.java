package first;
import java.util.*;

public class SwitchCaseExample {

	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter Number " );
	int num = scanner.nextInt();
	
	switch(num) {
	case 1:
		System.out.println( "Monday ");
		break;
	case 2:
		System.out.println( "Tuesday");
		break;	
	case 3:
		System.out.println( "wednesday");
		break;
	case 4:
		System.out.println( "Thursday ");
		break;
	case 5:
		System.out.println( "Friday");
		break;	
	case 6:
		System.out.println( "Saturday");
		break;
	default :
		System.out.println("Sunday");
	}
	scanner.close();
}
}
