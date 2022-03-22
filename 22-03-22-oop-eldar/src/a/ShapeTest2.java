package a;

public class ShapeTest2 {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle("Red", 3, 9);
		shapes[1] = new Circle("White", 2.4);
		shapes[2] = new Circle("Gray", 10);
		shapes[3] = new Rectangle("Pink", 2, 2);
		shapes[4] = new Rectangle("Brown", 100, 25);

		// iterate all array elements using for loop
		for (int i = 0; i < shapes.length; i++) {
			Shape shape = shapes[i];
			System.out.println(shape.getClass().getSimpleName());
			System.out.println("color: " + shape.getColor());
			System.out.println("area: " + shape.getArea());
			System.out.println("===============");
		}

	}

}
