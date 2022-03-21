package b.objects;

public class Employee extends Person {

	private double salary;

	public Employee() {
	}

	public Employee(int id, String name, int age, double salary) {
		super(id, name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void speak() {
		System.out.println(getName() + " speaks like an employee");
	}

}
