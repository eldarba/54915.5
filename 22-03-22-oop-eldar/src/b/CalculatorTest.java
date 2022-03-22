package b;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		System.out.println(c.add(5, 3));

		// handling 2 - try-catch
		try {
			System.out.println(c.div(100, 0));
		} catch (Exception e) {
			// e.printStackTrace(); // for debug
			System.out.println(e.getMessage());
		}

		// handling 2 - try-catch
		try {
			System.out.println(c.div(100, 2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
