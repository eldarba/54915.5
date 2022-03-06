package ex05;

public class Tar05B {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);

		System.out.println(a + ", " + b + ", " + c);

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
