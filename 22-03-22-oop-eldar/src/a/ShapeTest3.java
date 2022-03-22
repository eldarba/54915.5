package a;

import java.util.Scanner;

public class ShapeTest3 {

	public static void main(String[] args) {

		String[] colors = { "Red", "Green", "Blue", "White", "Black", "Pink", "Yellow" };

		Scanner sc = new Scanner(System.in);

		System.out.print("enter number of shapes to create: ");
		int numberOfShapes = sc.nextInt();
		sc.close();

		System.out.println("creating " + numberOfShapes + " shapes");

		Shape[] shapes = new Shape[numberOfShapes];
		for (int i = 0; i < shapes.length; i++) {
			// create a shape
			Shape shape;
			String color = colors[(int) (Math.random() * colors.length)];
			if (Math.random() < 0.5) {
				int length = (int) (Math.random() * 101);
				int width = (int) (Math.random() * 101);
				shape = new Rectangle(color, length, width);
			} else {
				int radius = (int) (Math.random() * 26);
				shape = new Circle(color, radius);
			}

			shapes[i] = shape;
		}

		System.out.println("printing shapes:");
		for (int i = 0; i < shapes.length; i++) {
			Shape shape = shapes[i];
			System.out.println(shape.getClass().getSimpleName());
			System.out.println("color: " + shape.getColor());
			System.out.println("area: " + shape.getArea());
			System.out.println("===============");
		}
	}

}
