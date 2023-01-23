package oops;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OverLoadDemo ol=new OverLoadDemo();
		ol.add(12.6, 13.4); // add method with double parameter invoked
		ol.add('a', 'b'); // type promoted to int
		ol.add(4, 5.0);  // int , double not available --> type promoted to double , double 
	}

}
