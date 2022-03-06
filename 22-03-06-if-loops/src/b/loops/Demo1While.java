package b.loops;

public class Demo1While {

	public static void main(String[] args) {

		int c = (int) (Math.random() * 101);

		while (c <= 80) {
			System.out.println(c);
			c = (int) (Math.random() * 101);
		}

		System.out.println("===========");
		System.out.println(c);

	}

}
