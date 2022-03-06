package ex05;

public class Tar04SalaryRaiser {

	public static void main(String[] args) {

		int min = 5000;
		int max = 6000;

		double salary = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println("salary: " + salary);

		double newSalary;
		if (salary * 1.1 <= max) {
			newSalary = salary * 1.1;
		} else {
			newSalary = max;
		}

		System.out.println("new salary: " + newSalary);

	}

}
