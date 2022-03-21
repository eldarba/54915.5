package a.arrays;

import java.util.Arrays;

public class Demo3Tar {

	public static void main(String[] args) {

		int[] grades = new int[100]; // an array of grades
		double sum = 0; // will be used to calculate the average

		for (int i = 0; i < grades.length; i++) {
			grades[i] = (int) (Math.random() * 101); // populate array with grades
			sum += grades[i]; // add current element to the sum
		}

		// print all grades:
		String gradesAsString = Arrays.toString(grades);
		System.out.println(gradesAsString);

		// print grades average:
		System.out.println("grades average:");
		System.out.println(sum / grades.length);
	}
}
