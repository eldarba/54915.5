package a;

public class ShapeTest {

	public static void main(String[] args) {

		// declare a Shape reference
		Shape shape;

		System.out.println("Rectangle ==========");
		// RECTANGLE
		// point to a Rectangle with the reference
		shape = new Rectangle("Blue", 10, 3);
		// use the Shape reference to print the color
		System.out.println(shape.getColor());
		// use the Shape reference to print the area
		System.out.println(shape.getArea());

		System.out.println("Circle =============");
		// CIRCLE
		// point to a Circle with the reference
		shape = new Circle("Yellow", 2.3);
		// use the Shape reference to print the color
		System.out.println(shape.getColor());
		// use the Shape reference to print the area
		System.out.println(shape.getArea());

	}

}
