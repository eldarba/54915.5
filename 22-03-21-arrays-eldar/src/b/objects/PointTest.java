package b.objects;

public class PointTest {

	public static void main(String[] args) {

		// create a Point object
		Point p = new Point();
		// print it
		p.print();

		// move it
		p.moveUp();
		p.moveUp();
		p.moveUp();
		p.moveRight();
		p.moveRight();

		// print it again
		p.print();
	}

}
