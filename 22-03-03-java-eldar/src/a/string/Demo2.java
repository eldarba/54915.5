package a.string;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {

		// we want a random number 0 - 10;

		double r = Math.random();
		System.out.println(r);
		System.out.println(r * 11);
		System.out.println((int) (r * 11));

		// ===========================================
		System.out.println("====================");
		// random number 0 - 10 inclusive
		int x = (int) (Math.random() * 11);
		System.out.println(x);

		// random number 0 - 50 inclusive
		int y = (int) (Math.random() * 51);
		System.out.println(y);

		// random number 50 - 100 inclusive
		x = (int) (Math.random() * 51) + 50;
		System.out.println(x);

	}

}
