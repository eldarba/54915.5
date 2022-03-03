package a.string;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		sc.close();
		
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);

	}

}
