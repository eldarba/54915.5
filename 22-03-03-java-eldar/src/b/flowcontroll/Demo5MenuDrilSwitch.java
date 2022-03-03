package b.flowcontroll;

import java.util.Scanner;

public class Demo5MenuDrilSwitch {

	public static void main(String[] args) {

		System.out.println("menu ======================");
		System.out.println("add 2 numbers ....... add");
		System.out.println("lucky number ........ luck");
		System.out.println("just exit ........... x");
		System.out.println("===========================");

		Scanner sc = new Scanner(System.in);
		System.out.print("your choice: ");
		String choice = sc.nextLine();

		switch (choice) {
		case "add":
			// do add here
			System.out.print("enter first number: ");
			int a = sc.nextInt();
			System.out.print("enter second number: ");
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println(a + " + " + b + " = " + sum);
			break;
		case "luck":
			int x = (int) (Math.random() * 101);
			System.out.println("your lucky number is: " + x);
			break;
		case "x":
			System.out.println("Bye!");
			break;
		default:
			System.out.println("Error: " + choice + " is not a valid choice");
		}

		sc.close();

	}

}
