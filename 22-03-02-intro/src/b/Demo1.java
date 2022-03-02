package b;

public class Demo1 {

	public static void main(String[] args) {

		// expression: 5 + 3
		// statement: assignment
		// block: a group of statements {}

		{ // block - a segment of memory
			// statements
			int x = 5 + 3;
			int y = 5 + 3;
			int z = 5 + 3;

			System.out.println(x);
		}

		{
			int x = 100;
			System.out.println();
		}

		// System.out.println(x); // error - out of scope

	}

}
