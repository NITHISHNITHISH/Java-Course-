package first;

public class GeoMetricalCalculations {

	public static void main(String[] args) {
		
		int sideOfSquare=25;
		double PI_VALUE=3.14,areaOfSquare,areaOfCircle,areaOfRectangle;
		
		int radius=14;
		int length=20;
		int breath=15;
		
		areaOfSquare = PI_VALUE*sideOfSquare;
		areaOfCircle = PI_VALUE*Math.pow(radius, 2);
		areaOfRectangle =length*breath;
		
		System.out.println("Area of the Square :" +areaOfSquare);
		System.out.println("Area of the Circle :" +areaOfCircle);
		System.out.println("Area of the Rectangle:"+areaOfRectangle);
	}

}
