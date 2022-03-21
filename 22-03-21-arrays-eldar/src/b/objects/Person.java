package b.objects;

public class Person {
	// fields
	private int id;
	private String name;
	private int age;

	// constructors - special methods for creating objects
	// CTOR 1 - default
	public Person() {

	}

	// CTOR 2 - with parameters
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age);
	}

	// methods
	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println(name + " speaks like a person");
	}

}
