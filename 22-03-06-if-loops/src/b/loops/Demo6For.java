package b.loops;

public class Demo6For {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(" * ");
		}
		System.out.println();

		for (int i = 1; i <= 15; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		for (int i = 20; i <= 30; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		for (int i = 30; i >= 20; i--) {
			System.out.print(i + ", ");
		}
		System.out.println();

		for (int i = 18; i <= 30; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();

		for (int i = 0; i <= 100; i++) {
			// print only if pass the test
			if (i % 7 == 0 || i % 4 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();

	}

}
