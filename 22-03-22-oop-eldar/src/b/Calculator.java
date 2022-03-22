package b;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	// method with throws declaration - handling 1
	public int div(int a, int b) throws Exception {
		if (b != 0) {
			return a / b;
		} else {
			// creating an exception object
			String msg = "error: divide by 0";
			Exception e = new Exception(msg);
			// throwing the exception
			throw e;
		}
	}

}
