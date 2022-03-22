package c;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(282);
		} catch (MyAppException e) {
			// handler - what to do if an exception was thrown
			e.printStackTrace();
		}

		System.out.println(p.getAge());

	}

}
