package a;

public class Rectangle extends Shape {

	// fields
	private double length;
	private double width;

	// CTORs
	public Rectangle() {
	}

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	// methods
	@Override
	public double getArea() {
		return length * width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
