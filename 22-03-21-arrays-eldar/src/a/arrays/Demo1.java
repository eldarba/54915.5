package a.arrays;

public class Demo1 {

	public static void main(String[] args) {

		// create an array of 4 int elements
		int[] arr = new int[4];

		// populate the array with data
		arr[0] = 10;
		arr[1] = 7;
		arr[2] = 3;
		arr[3] = 19;

		// access elements and print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		System.out.println("=================");

		// iterate array elements using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
