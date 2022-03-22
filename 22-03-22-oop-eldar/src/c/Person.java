package c;

public class Person {

	private int id;
	private String name;
	private int age;

	// constant
	public static final int MAX_AGE = 120;
	public static final int MIN_AGE = 0;

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

	public int getAge() {
		return age;
	}

	// documentation comment
	/**
	 * set the age of this person instance
	 * 
	 * @param age the new age
	 * @throws MyAppException if the age is illegal
	 */
	public void setAge(int age) throws MyAppException {
		if (age >= MIN_AGE && age <= MAX_AGE) {
			this.age = age;
		} else {
			throw new MyAppException("setAge failed - illegal value: " + age);
		}
	}

}
