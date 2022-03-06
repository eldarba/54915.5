package ex05;

public class Tar05C {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);
		// add 2 more variables
		int d = (int) (Math.random() * 101);
		int e = (int) (Math.random() * 101);

		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);

		if (a > b && a > c && a > d && a > e) {
			System.out.println(a);
		} else if (b > c && b > d && b > e) {
			System.out.println(b);
		} else if (c > d && c > e) {
			System.out.println(c);
		} else if (d > e) {
			System.out.println(d);
		} else {
			System.out.println(e);
		}
	}

}
