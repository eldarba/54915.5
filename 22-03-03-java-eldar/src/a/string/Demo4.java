package a.string;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		// get input from user (keyboard)
		// we need an object that can do input - Scanner

		// create a scanner object connected to keyboard
		Scanner sc = new Scanner(System.in);
		// ask the user for input
		System.out.println("enter name:");
		// get the input from the user as String
		String input = sc.nextLine();
		// print a message
		System.out.println("Hello " + input);
		// close the scanner
		sc.close();

	}

}
