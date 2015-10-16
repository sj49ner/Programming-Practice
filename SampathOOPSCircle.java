public class SampathOOPSCircle {
	
	public static void main(String args[]){
		
		double radius = 5;
		Shape s = new Circle(radius);
		
		double areaResult = s.calculateArea();
		double perimeterResult = s.calculatePerimeter();
		
		System.out.println("Area: " + areaResult);
		System.out.println("Perimeter: " + perimeterResult);
		
	}
	

}
