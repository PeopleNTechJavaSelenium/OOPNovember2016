package polymorphism;

public class TestShape {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		int triangleSize = shape.areaOfLand(10, 12, 13);
		System.out.println(triangleSize);
		int rectangleSize = shape.areaOfLand(10, 12, 13, 15);
		System.out.println(rectangleSize);
		
		Shape superShape = new SuperShape();
		int superrectangleSize = superShape.areaOfLand(10, 12, 13, 15);
		System.out.println(superrectangleSize);
	}

}
