package b.objects;

public class EmployeeTest {

	public static void main(String[] args) {

		// polimorphysm - pointing an object with different type of references

		Employee e = new Employee(1, "aaa", 33, 1500); // reference - Employee / object - Employee
		Person p = new Employee(2, "bbb", 44, 2200); // reference - Person / object - Employee
		Person p2 = new Person(3, "ccc", 15); // reference - Person / object - Person

		Person[] persons = new Person[3];
		persons[0] = p;
		persons[1] = e;
		persons[2] = p2;

		for (int i = 0; i < persons.length; i++) {
			persons[i].speak();
		}

	}

}
