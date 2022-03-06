package ex05;

public class Tar02 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11);
		System.out.println(r);

		if (r < 5) {
			System.out.println("small");
		} else if (r > 5) {
			System.out.println("big");
		} else {
			System.out.println("Bingo");
		}

	}

}
