package b.loops;

import java.util.Scanner;

public class Demo3WhilePassword {

	public static void main(String[] args) {

		int pass = 123;
		Scanner sc = new Scanner(System.in);

		// prompt the user to enter password
		System.out.print("enter  password: ");
		int userInput = sc.nextInt();

		while (userInput != pass) {
			System.out.print("enter  password: ");
			userInput = sc.nextInt();
		}

		System.out.println("you are logged in");
		sc.close();

	}

}
