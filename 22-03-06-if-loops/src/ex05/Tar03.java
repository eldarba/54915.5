package ex05;

public class Tar03 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 101);
		System.out.println(r);

		if (r <= 50) {
			System.out.println("small");
		} else {
			System.out.println("big");
		}

		// == is equals operator
		// % is modulus operator
		if (r % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
