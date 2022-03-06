package a;

public class DemoOperators {

	public static void main(String[] args) {

		// arithmetical operators
		// +, -
		System.out.println(10 + 4);
		System.out.println(10 - 4);

		// *, /
		System.out.println(10 * 4);
		System.out.println(10 / 4);
		System.out.println(10 / 4D); // decimal

		// % means modulus - the remainder from division
		System.out.println(7 % 4);
		System.out.println(100 % 5);
		System.out.println(5 % 100);

		// is 738 is divided by 23
		if (738 % 23 == 0) {
			System.out.println("divided");
		} else {
			System.out.println("NOT divided");
		}

		// logical operators
		// <, >, <=, >=
		System.out.println(10 < 100); // true
		System.out.println(10 <= 100); // true
		System.out.println(10 > 100); // false
		System.out.println(10 >= 100); // false

		// ==, !=
		System.out.println(10 == 10); // true
		System.out.println(10 != 10); // false

		// ! - NOT
		System.out.println(true);
		System.out.println(!true);

		System.out.println(!(10 < 100)); // false

		// complex boolean expression
		// && AND
		System.out.println(10 < 100 && 10 % 2 == 0); // true

		// || OR
		System.out.println(10 > 100 || 10 % 2 == 0); // true

		System.out.println("====================");
		// example - legal age is 18 - 80
		int age = (int) (Math.random() * 121);
		System.out.println("age: " + age);

		// check if legal
		if (age >= 18 && age <= 80) {
			System.out.println("legal");
		} else {
			System.out.println("ilegal");
		}

		// check if illegal
		if (age < 18 || age > 80) {
			System.out.println("illegal");
		} else {
			System.out.println("legal");
		}

		System.out.println("===============");
		// ternary operator ?:
		int x = (int) (Math.random() * 101);
		int y = (int) (Math.random() * 101);
		System.out.println(x + ", " + y);

		int max = x > y ? x : y;
		System.out.println("max is " + max);

		// in summary:

		// arithmetical operators:
		// +, -, *, /, %

		// logical operators:
		// <, <=, >, >=, ==, !=, !

		// complex boolean expressions
		// &&, ||

		// ternary operator
		// ?:

	}

}
