package ex05;

public class Tar05D {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);
		int d = (int) (Math.random() * 101);
		int e = (int) (Math.random() * 101);
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);

		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		if (e > max) {
			max = e;
		}

		System.out.println(max);

	}

}
