package b.objects;

public class Point {
	// fields
	private int x;
	private int y;

	// CTOR 1
	public Point() {
	}

	// CTOR 2
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// CTOR 3
	public Point(int val) {
		this(val, val); // invoke another CTOR in this class
	}

	// methods
	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

	public void moveRight() {
		x++;
	}

	public void moveLeft() {
		x--;
	}

	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}

}
