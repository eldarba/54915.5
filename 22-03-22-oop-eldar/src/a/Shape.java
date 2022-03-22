package a;

// class declaration (abstract)
public abstract class Shape {

	// field
	private String color;

	// CTOR 1
	public Shape() {
		super();
	}

	// CTOR 2
	public Shape(String color) {
		super();
		this.color = color;
	}

	// getters and setters methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// abstract method
	public abstract double getArea();

}
