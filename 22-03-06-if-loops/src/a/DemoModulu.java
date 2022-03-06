package a;

public class DemoModulu {

	public static void main(String[] args) {

		int a = 10, b = 3, c;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);

		c = a / b;
		System.out.println(c);

		// % operator is modulus: the remainder as a result of division
		c = a % b;
		System.out.println(c);

		System.out.println(a + "/" + b + " = " + (a / b) + ":remainder " + (a % b));

	}

}
