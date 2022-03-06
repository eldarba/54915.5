package ex05;

public class Tar01 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);

		System.out.println(a + ", " + b);

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

}
